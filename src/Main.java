/**
 * Main Method which will instantiate necessary classes and run the MonteCarlo Simulation against the proposed
 * portfolios. This will output the performance of the portfolios after the given years (20), and number of
 * simulations (10000)
 */
public class Main {
    public static void main(String[] args) {
        Portfolio riskyPortfolio = new Portfolio(15.675, 9.4324);
        Portfolio conservativePortfolio = new Portfolio( 6.3438, 6.189);
        MonteCarloSimulator monteCarloSimulator = new MonteCarloSimulator();
        monteCarloSimulator.comparePortfolios(10000, 20, 100000, riskyPortfolio, conservativePortfolio);
    }
}
