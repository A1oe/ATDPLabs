/**
 * 
 */

/**
 * @author atdp-11 Alyssa Lo
 *
 */

public class TokenPa {
	private int[] board;
	private int currentPlayer;

	// Creates a board array to be of size playerCount and fills it with
	// random integer values from 1 to 10, inclusive. Initializes currentPlayer
	// to a random integer value in the range between 0 and (playerCount - 1).
	// inclusive.
	// @param: playerCount - the number of players
	public TokenPa (int playerCount) {
		// implemented in part (a)

		board = new int [playerCount]; // Create board array

		for (int i : board){ // fill board w/ ints from 1-10
			board[i] = (int)(Math.random()*10 + 1);		
		}

		currentPlayer = (int)(Math.random()*(playerCount)); // random current player
	}

	// Distributes the tokens from the current player's position one at a time
	// to each player in the game. Distribution begins with the next position
	// and continues until all the tokens have been distributed. If there are
	// still tokens to distribute when the player at the highest position is
	// reached, the next token will be distributed to the player at position
	// 0.
	// PRECONDITION: the current player has at least one token
	// POSTCONDITION: the current player has not changed
	public void distributeCurrentPlayerTokens() {
		// implemented in part (b)

		int holder = board[currentPlayer]; // # of tokens in current player's box
		board[currentPlayer] = 0; // remove tokens from box
		
		for (int i = 0; i < holder; i++){ // add tokens to each box
			board[currentPlayer + 1 + i]++;
		}

	}
}
