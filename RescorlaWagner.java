public class RescorlaWagner {
	
	private double deltaV = 0.0;
	private double lamda;
	private double sumV;
	private double alpha;
	private double beta;
	
	public RescorlaWagner(double alpha, double beta, double lamda, double sumV) {
		this.lamda = lamda;
		this.sumV = sumV;
		this.alpha = alpha;
		this.beta = beta;
	}
	
	public double computeDeltaV() {
		double computed = ((alpha * beta) * (lamda - sumV));
		
		if (deltaV == 0.0) {
			setSumV(computed);
			setDeltaV(computed);
		} else {
			setSumV(deltaV + computed);
			setDeltaV(computed);
		}
		return computed;
	}
	
	public double getDeltaV() {
		return deltaV;
	}
	
	public double getLamda() {
		return lamda;
	}
	
	public double getSumV() {
		return sumV;
	}
	
	public double getAlpha() {
		return alpha;
	}
	
	public double getBeta() {
		return beta;
	}

	public void setDeltaV(double newDeltaV) {
		deltaV = newDeltaV;
	}
	
	public void setLamda(double newLamda) {
		lamda = newLamda;
	}
	
	public void setSumV(double newSumV) {
		sumV = newSumV;
	}
	
	public void setAlpha(double newAlpha) {
		alpha = newAlpha;
	}
	
	public void setBeta(double newBeta) {
		beta = newBeta;
	}
}

