package aplication;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		while(true) {
			try {
				UI.printBoard(chessMatch.getPieces());
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(sc);
				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(sc);
				ChessPiece capturedMatch = chessMatch.performChessMove(source, target);
			}
			catch (ChessException e) {
				System.out.println("There is no Piece on board");
			}
			catch (InputMismatchException e) {
				System.out.println("Error reading ChessPosition. Valid values are from a1 to h8");
			}
			}
		
	}

}
