package LeetCode.Hard;

import java.util.*;

public class CameraView {

	public static void main(String[] args) {
		
//		What is Sliding Window Technique/ Algorithm?
//				The Sliding window is a problem-solving technique that runs over a given data in Array or String form.  
// It is so-called because it will slide on data to satisfy certain conditions by expanding or diminishing subsets. 
//
//				This technique helps you convert nested loops to a single loop, reducing time complexity from O(n²) to O(n).
		
		
		List<List<Integer>> points = new ArrayList<>(Arrays.asList(
			    Arrays.asList(2,1),
			    Arrays.asList(2,2),
			    Arrays.asList(3,3)));
		List<Integer> location = Arrays.asList(15,50);
		
		List<List<Integer>> outerList = new ArrayList<>(Arrays.asList(
			    Arrays.asList(60, 61),
			    Arrays.asList(58, 47),
			    Arrays.asList(17, 26),
			    Arrays.asList(87, 97),
			    Arrays.asList(63, 63),
			    Arrays.asList(26, 50),
			    Arrays.asList(70, 21),
			    Arrays.asList(3, 89),
			    Arrays.asList(51, 24),
			    Arrays.asList(55, 14),
			    Arrays.asList(6, 51),
			    Arrays.asList(64, 21),
			    Arrays.asList(66, 33),
			    Arrays.asList(54, 35),
			    Arrays.asList(87, 38),
			    Arrays.asList(30, 0),
			    Arrays.asList(37, 92),
			    Arrays.asList(92, 12),
			    Arrays.asList(60, 73),
			    Arrays.asList(75, 98),
			    Arrays.asList(1, 11),
			    Arrays.asList(88, 24),
			    Arrays.asList(82, 92)
			));
		
		System.out.print(visiblePoints(outerList,44,location));
	}

	public static int visiblePoints(List<List<Integer>> points, int angle, List<Integer> location) {
		List<Double> angles = new ArrayList<>();
		int countOfSameLocation = 0;
		for(List<Integer> point : points){
			int dx = point.get(0) - location.get(0);
			int dy = point.get(1) - location.get(1);

			if(dx == 0 && dy ==0){
				countOfSameLocation++;
			}else{
				double degree = Math.toDegrees(Math.atan2(dy, dx));
				angles.add(degree);
				angles.add(degree + 360);
				}  
		}

		Collections.sort(angles);
		int sizeOfAngles = angles.size();
		
		int maxPoints = 0;
		for(int begin = 0, end = 0 ; end < sizeOfAngles ; end++){
			while(angles.get(end) - angles.get(begin) > angle){
				begin++;
			}
			maxPoints = Math.max(maxPoints,end - begin + 1);
		}

		return maxPoints + countOfSameLocation;
		
		//Given a fixed camera in a forest (with predefined trees), give the best angle in which the camera pictures the maximum of trees.
//				List<Integer> trees = Arrays.asList(12, 73, 77, 94, 128, 50, 26, 170);
//				int k = 45;
//				Collections.sort(trees);
//				int size = trees.size();
//				
//				int maxTrees = 0;
//				for(int begin = 0, end = 0 ; end < size ; end++){
//					while(trees.get(end) - trees.get(begin) > k){
//						begin++;
//					}
//					maxTrees = Math.max(maxTrees,end - begin + 1);
//				}
//				
//				return maxTrees;
	}
}
