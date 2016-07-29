/**
 * 
 */

/**
 * @author atdp-11 Alyssa lo
 *
 */

public class Sound {
	// the array of values in this sound; guaranteed not to be null
	private int [] samples;

	// changes those values in this sound that have an amplitude greater than
	// limit.
	// values greater than limit are changed to limit.
	// values less than -limit are changed to -limit
	// @param: limit - the amplitude limit
	// PRECONDITION: limit >= 0
	// @return: the number of values in this sound that this method changed
	public int limitAmplitude (int limit) {
		// to be implemented in part (a)

		int changed = 0; // return value
		limit = Math.abs(limit); // Make Sure limit Is Positive

		for (int i = 0; i < samples.length; i++){ // Go Through Each Element
			if (samples[i] > limit){ 
				samples[i] = limit; // Make values > limit = limit
				changed++; // Add 1 to # of elements changed
			} else if (samples[i] < -limit){
				samples[i] = -limit; // Make values < -limit = -limit
				changed++;
			} 
		}

		return changed;
	}
	// removes all silence from the beginning of this sound
	// silence is represented by a value of 0
	// PRECONDITION: samples contains at least one nonzero value
	// POSTCONDITION: the length of samples reflects the removal of starting
	// silence
	public void trimSilenceFromBeginning() {
		// to be implemented in part (b)
		int count = 0; // How Many Zeros Are In The Front

		while (samples[0] == 0) { 
			int x = samples[0]; // Extra Holder Variable

			for (int a = 0; a < samples.length; a++){ // Go Through Each Element	
				samples[a] = samples[a+1]; // Move Everything Up One
				samples[samples.length - 1] = x; // Last One = Original 1st One
			}

			count++;
		} 
		
		int length = samples.length - count; // Length Of New Array	
		int [] newRay = new int [length];
		
		for (int i = 0; i < newRay.length; i++){ // Inputting Values To New Array
			newRay[i] = samples[i];
		}
		
		samples = newRay;
	}
}
