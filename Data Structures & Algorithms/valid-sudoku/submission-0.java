class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, Set<Character>> cols = new HashMap<Integer, Set<Character>>();
        HashMap<Integer, Set<Character>> rows = new HashMap<Integer, Set<Character>>();
        HashMap<String, Set<Character>> squares = new HashMap<String, Set<Character>>();
    
        for(int r= 0; r < board[0].length; r++){
            for(int c=0; c < board[0].length; c++){

                String squareKey = (r/3) + "," + (c/3);
                if(board[r][c] != '.'){
                    Set<Character> rowSet = rows.computeIfAbsent(r, k -> new HashSet<>());
                    Set<Character> colSet = cols.computeIfAbsent(c, k -> new HashSet<>());
                    Set<Character> squareSet = squares.computeIfAbsent(squareKey, k -> new HashSet<>());

                    if(colSet.contains(board[r][c]) || rowSet.contains(board[r][c]) || squareSet.contains(board[r][c])){
                        return false;
                    }

                    colSet.add(board[r][c]);
                    rowSet.add(board[r][c]);
                    squareSet.add(board[r][c]);
                }
            }
        }

        return true;

    }
}
