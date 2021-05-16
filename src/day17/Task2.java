package day17;

public class Task2 {
    public static void main(String[] args) {

        ChessBoard chessBoard = new ChessBoard(new ChessPiece[][]{
                {ChessPiece.ROOK_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.ROOK_BLACK, ChessPiece.PAWN_WHITE,ChessPiece.BISHOP_BLACK,ChessPiece.EMPTY, ChessPiece.KNIGHT_WHITE},
                {ChessPiece.ROOK_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.ROOK_BLACK, ChessPiece.PAWN_WHITE,ChessPiece.BISHOP_BLACK,ChessPiece.EMPTY, ChessPiece.KNIGHT_WHITE},
                {ChessPiece.ROOK_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.ROOK_BLACK, ChessPiece.PAWN_WHITE,ChessPiece.BISHOP_BLACK,ChessPiece.EMPTY, ChessPiece.KNIGHT_WHITE},
                {ChessPiece.ROOK_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.ROOK_BLACK, ChessPiece.PAWN_WHITE,ChessPiece.BISHOP_BLACK,ChessPiece.EMPTY, ChessPiece.KNIGHT_WHITE},
                {ChessPiece.ROOK_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.ROOK_BLACK, ChessPiece.PAWN_WHITE,ChessPiece.BISHOP_BLACK,ChessPiece.EMPTY, ChessPiece.KNIGHT_WHITE},
                {ChessPiece.ROOK_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.ROOK_BLACK, ChessPiece.PAWN_WHITE,ChessPiece.BISHOP_BLACK,ChessPiece.EMPTY, ChessPiece.KNIGHT_WHITE},
                {ChessPiece.ROOK_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.ROOK_BLACK, ChessPiece.PAWN_WHITE,ChessPiece.BISHOP_BLACK,ChessPiece.EMPTY, ChessPiece.KNIGHT_WHITE},
                {ChessPiece.ROOK_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.ROOK_BLACK, ChessPiece.PAWN_WHITE,ChessPiece.BISHOP_BLACK,ChessPiece.EMPTY, ChessPiece.KNIGHT_WHITE},


        });
        chessBoard.print();
    }
}
