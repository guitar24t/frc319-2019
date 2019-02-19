package frc.arcs;

import com.team319.follower.SrxMotionProfile;
import com.team319.follower.SrxTrajectory;

public class DistanceScalingArc extends SrxTrajectory {
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (2.00,13.50,0.00)
	// (5.00,13.50,0.00)
	
    public DistanceScalingArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public DistanceScalingArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.000,0.000,10.000,0.000},
				{2.503,25.033,10.000,0.000},
				{7.510,50.066,10.000,0.000},
				{15.020,75.099,10.000,0.000},
				{25.033,100.132,10.000,0.000},
				{37.549,125.165,10.000,0.000},
				{52.569,150.197,10.000,0.000},
				{70.092,175.230,10.000,0.000},
				{90.118,200.263,10.000,0.000},
				{112.648,225.296,10.000,0.000},
				{137.681,250.329,10.000,0.000},
				{165.217,275.362,10.000,0.000},
				{195.257,300.395,10.000,0.000},
				{227.799,325.428,10.000,0.000},
				{262.846,350.461,10.000,0.000},
				{300.395,375.494,10.000,0.000},
				{340.448,400.527,10.000,0.000},
				{383.003,425.559,10.000,0.000},
				{428.063,450.592,10.000,0.000},
				{475.625,475.625,10.000,0.000},
				{525.691,500.658,10.000,0.000},
				{578.260,525.691,10.000,0.000},
				{633.333,550.724,10.000,0.000},
				{690.908,575.757,10.000,0.000},
				{750.987,600.790,10.000,0.000},
				{813.570,625.823,10.000,0.000},
				{878.655,650.856,10.000,0.000},
				{946.244,675.889,10.000,0.000},
				{1016.336,700.921,10.000,0.000},
				{1088.931,725.954,10.000,0.000},
				{1164.030,750.987,10.000,0.000},
				{1241.632,776.020,10.000,0.000},
				{1321.738,801.053,10.000,0.000},
				{1404.346,826.086,10.000,0.000},
				{1489.458,851.119,10.000,0.000},
				{1577.073,876.152,10.000,0.000},
				{1667.192,901.185,10.000,0.000},
				{1759.813,926.218,10.000,0.000},
				{1853.687,938.734,10.000,0.000},
				{1947.560,938.734,10.000,0.000},
				{2041.434,938.734,10.000,0.000},
				{2135.307,938.734,10.000,0.000},
				{2229.180,938.734,10.000,0.000},
				{2323.054,938.734,10.000,0.000},
				{2416.927,938.734,10.000,0.000},
				{2510.801,938.734,10.000,0.000},
				{2604.674,938.734,10.000,0.000},
				{2698.547,938.734,10.000,0.000},
				{2792.421,938.734,10.000,0.000},
				{2886.294,938.734,10.000,0.000},
				{2980.168,938.734,10.000,0.000},
				{3074.041,938.734,10.000,0.000},
				{3167.915,938.734,10.000,0.000},
				{3261.788,938.734,10.000,0.000},
				{3355.661,938.734,10.000,0.000},
				{3449.535,938.734,10.000,0.000},
				{3543.408,938.734,10.000,0.000},
				{3637.282,938.734,10.000,0.000},
				{3731.155,938.734,10.000,0.000},
				{3825.028,938.734,10.000,0.000},
				{3918.902,938.734,10.000,0.000},
				{4012.775,938.734,10.000,0.000},
				{4106.649,938.734,10.000,0.000},
				{4200.522,938.734,10.000,0.000},
				{4294.395,938.734,10.000,0.000},
				{4388.269,938.734,10.000,0.000},
				{4482.142,938.734,10.000,0.000},
				{4576.016,938.734,10.000,0.000},
				{4669.889,938.734,10.000,0.000},
				{4763.762,938.734,10.000,0.000},
				{4857.636,938.734,10.000,0.000},
				{4951.509,938.734,10.000,0.000},
				{5045.383,938.734,10.000,0.000},
				{5139.256,938.734,10.000,0.000},
				{5233.129,938.734,10.000,0.000},
				{5327.003,938.734,10.000,0.000},
				{5420.876,938.734,10.000,0.000},
				{5514.750,938.734,10.000,0.000},
				{5608.623,938.734,10.000,0.000},
				{5702.496,938.734,10.000,0.000},
				{5796.370,938.734,10.000,0.000},
				{5890.243,938.734,10.000,0.000},
				{5984.117,938.734,10.000,0.000},
				{6077.990,938.734,10.000,0.000},
				{6171.863,938.734,10.000,0.000},
				{6265.737,938.734,10.000,0.000},
				{6359.610,938.734,10.000,0.000},
				{6453.484,938.734,10.000,0.000},
				{6547.357,938.734,10.000,0.000},
				{6641.231,938.734,10.000,0.000},
				{6735.104,938.734,10.000,0.000},
				{6828.977,938.734,10.000,0.000},
				{6922.851,938.734,10.000,0.000},
				{7016.724,938.734,10.000,0.000},
				{7110.598,938.734,10.000,0.000},
				{7204.471,938.734,10.000,0.000},
				{7298.344,938.734,10.000,0.000},
				{7392.218,938.734,10.000,0.000},
				{7486.091,938.734,10.000,0.000},
				{7579.965,938.734,10.000,0.000},
				{7673.838,938.734,10.000,0.000},
				{7765.208,913.701,10.000,0.000},
				{7854.075,888.668,10.000,0.000},
				{7940.438,863.635,10.000,0.000},
				{8024.299,838.602,10.000,0.000},
				{8105.656,813.570,10.000,0.000},
				{8184.509,788.537,10.000,0.000},
				{8260.860,763.504,10.000,0.000},
				{8334.707,738.471,10.000,0.000},
				{8406.051,713.438,10.000,0.000},
				{8474.891,688.405,10.000,0.000},
				{8541.228,663.372,10.000,0.000},
				{8605.062,638.339,10.000,0.000},
				{8666.393,613.306,10.000,0.000},
				{8725.220,588.273,10.000,0.000},
				{8781.544,563.240,10.000,0.000},
				{8835.365,538.208,10.000,0.000},
				{8886.682,513.175,10.000,0.000},
				{8935.497,488.142,10.000,0.000},
				{8981.807,463.109,10.000,0.000},
				{9025.615,438.076,10.000,0.000},
				{9066.919,413.043,10.000,0.000},
				{9105.720,388.010,10.000,0.000},
				{9142.018,362.977,10.000,0.000},
				{9175.812,337.944,10.000,0.000},
				{9207.104,312.911,10.000,0.000},
				{9235.891,287.878,10.000,0.000},
				{9262.176,262.846,10.000,0.000},
				{9285.957,237.813,10.000,0.000},
				{9307.235,212.780,10.000,0.000},
				{9326.010,187.747,10.000,0.000},
				{9342.281,162.714,10.000,0.000},
				{9356.049,137.681,10.000,0.000},
				{9367.314,112.648,10.000,0.000},
				{9376.076,87.615,10.000,0.000},
				{9382.334,62.582,10.000,0.000},
				{9386.089,37.549,10.000,0.000}		};

}