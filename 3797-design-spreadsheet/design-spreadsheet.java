class Spreadsheet {
    int[][] matrix;

    public Spreadsheet(int rows) {
        matrix = new int[rows][26];
    }

    public void setCell(String cell, int value) {
        int[] pos = cellToIndex(cell);
        matrix[pos[0]][pos[1]] = value;
    }

    public void resetCell(String cell) {
        int[] pos = cellToIndex(cell);
        matrix[pos[0]][pos[1]] = 0;
    }

    public int getValue(String formula) {
        if (formula.startsWith("=")) {
            formula = formula.substring(1);
        }

        String[] parts = formula.split("\\+");
        String left = parts[0];
        String right = parts[1];

        return getTermValue(left) + getTermValue(right);
    }

    private int getTermValue(String term) {
        if (isCell(term)) {
            int[] pos = cellToIndex(term);
            return matrix[pos[0]][pos[1]];
        }
        return Integer.parseInt(term);
    }

    private boolean isCell(String term) {
        return Character.isLetter(term.charAt(0));
    }

    private int[] cellToIndex(String cell) {
        int col = cell.charAt(0) - 'A'; 
        int row = Integer.parseInt(cell.substring(1)) - 1;
        return new int[] { row, col };
    }
}