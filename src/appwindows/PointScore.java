package appwindows;

public class PointScore {
	
	private static int youpoints;
	private static int pcpoints;
	protected static int youscore;
	protected static int pcscore;

	public static String score(int you, int pc) {
		
		you = youscore;
		pc = pcscore;
		
		if (you != 21 && pc == 21) {
			pcpoints += 1;
			return "Points: YOU = [" + PointScore.youpoints + "] PC = [" + PointScore.pcpoints + "]";
		} else if (you > 21 && pc <= 21) {
			pcpoints += 1;
			return "Points: YOU = [" + PointScore.youpoints + "] PC = [" + PointScore.pcpoints + "]";
		} else if (you > 21 && pc > 21) {
			if (you < pc) {
				youpoints += 1;
				return "Pounts: YOU = [" + PointScore.youpoints + "] PC = [" + PointScore.pcpoints + "]";
			} else if (you > pc) {
				pcpoints += 1;
				return "Points: YOU = [" + PointScore.youpoints + "] PC = [" + PointScore.pcpoints + "]";
			} else if (you == pc) {
				return "Points: YOU = [" + PointScore.youpoints + "] PC = [" + PointScore.pcpoints + "]";
			}
		} else if (you < 21 && pc < 21) {
			if (you > pc) {
				youpoints += 1;
				return "Pounts: YOU = [" + PointScore.youpoints + "] PC = [" + PointScore.pcpoints + "]";
			} else if (you < pc) {
				pcpoints += 1;
				return "Points: YOU = [" + PointScore.youpoints + "] PC = [" + PointScore.pcpoints + "]";
			} else if (you == pc) {
				return "Points: YOU = [" + PointScore.youpoints + "] PC = [" + PointScore.pcpoints + "]";
			}
		} else if (you == 21 && pc < 21) {
			youpoints += 1;
			return "Points: YOU = [" + PointScore.youpoints + "] PC = [" + PointScore.pcpoints + "]";
		} else if (you <= 21 && pc > 21) {
			youpoints += 1;
			return "Points: YOU = [" + PointScore.youpoints + "] PC = [" + PointScore.pcpoints + "]";
		} else if (you == pc) {
			return "Points: YOU = [" + PointScore.youpoints + "] PC = [" + PointScore.pcpoints + "]";
		}
		return null;
	}
}
