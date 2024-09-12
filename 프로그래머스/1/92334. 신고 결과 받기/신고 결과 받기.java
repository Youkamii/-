import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Integer> idIndex = new HashMap<>();
        Map<String, List<String>> reportMap = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            idIndex.put(id_list[i], i);
            reportMap.put(id_list[i], new ArrayList<>());
        }

        for (String reported : report) {
            String[] temp = reported.split(" ");
            if (!reportMap.get(temp[1]).contains(temp[0])) {
                reportMap.get(temp[1]).add(temp[0]);
            }
        }

        for (String id : reportMap.keySet()) {
            if (k <= reportMap.get(id).size()) {
                for (String reporter : reportMap.get(id)) {
                    answer[idIndex.get(reporter)]++;
                }
            }
        }

        return answer;
    }
}

//============================================================================


// import java.util.*;

// class Solution {
//     public int[] solution(String[] id_list, String[] report, int k) {
//         Map<String, User79> user = new HashMap<>();
// 		int[] answer = new int[id_list.length];
// 		//Map k v

// 		for (String s : id_list) {
// 			User79 nullList = new User79();
// 			user.put(s, nullList);
// 		}
// 		for (String s : report) {
// 			String[] reporting = s.split(" ");

// 			String reporte_R_Id = reporting[0]; // 신고자
// 			String reporte_D_Id = reporting[1]; // 신고당한 사람

// 			User79 reporter = user.get(reporte_R_Id);
// 			User79 reported = user.get(reporte_D_Id);

// 			// 중복신고
// 			if (!reporter.reportUser.contains(reporte_D_Id)) {
// 				reporter.reportUser.add(reporte_D_Id);
// 				reported.whoReportMe.add(reporte_R_Id);
// 			}
// 		}

// 		for (int i = 0; i < answer.length; i++) {
// 			User79 mailedUser = user.get(id_list[i]);

// 			for (String reportedId : mailedUser.reportUser) {
// 				User79 reported = user.get(reportedId); 

// 				if (reported.whoReportMe.size() >= k)
// 					answer[i]++;

// 			}
// 		}



// 		return answer;
//     }
    
//     class User79 {
// 		List<String> reportUser;
// 		List<String> whoReportMe;

//     	public User79() {
// 			this.reportUser = new ArrayList<>();
// 			this.whoReportMe = new ArrayList<>();
// 		}
// 	}
// }

