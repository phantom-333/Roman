public class Roman {

     public int romanToInt(String s) {
        int i = 0;
        int res = 0;
        int nextSym = 0;

        while (i < s.length()) {
            char letter = s.charAt(i);
            switch (letter) {
                case 'I':
                    nextSym = i + 1;
                    if (nextSym < s.length() && s.charAt(nextSym) == 'V') {
                        res += 4;
                        i++;
                    } else if (nextSym < s.length() && s.charAt(nextSym) == 'X') {
                        res += 9;
                        i++;
                    } else {
                        res++;
                    }
                    break;
                case 'V':
                    res += 5;
                    break;
                case 'X':
                    nextSym = i + 1;
                    if (nextSym < s.length() && s.charAt(nextSym) == 'L') {
                        res += 40;
                        i++;
                    } else if (nextSym < s.length() && s.charAt(nextSym) == 'C') {
                        res += 90;
                        i++;
                    } else {
                        res += 10;
                    }
                    break;
                case 'L':
                    res += 50;
                    break;
                case 'C':
                    nextSym = i + 1;
                    if (nextSym < s.length() && s.charAt(nextSym) == 'D') {
                        res += 400;
                        i++;
                    } else if (nextSym < s.length() && s.charAt(nextSym) == 'M') {
                        res += 900;
                        i++;
                    } else {
                        res += 100;
                    }
                    break;
                case 'D':
                    res += 500;
                    break;
                case 'M':
                    res += 1000;
                    break;
                default:
                    break;
            }
            i++;
        }
        return res;
    }
}
