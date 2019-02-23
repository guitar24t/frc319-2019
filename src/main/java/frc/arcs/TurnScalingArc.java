package frc.arcs;

import com.team319.follower.SrxMotionProfile;
import com.team319.follower.SrxTrajectory;

public class TurnScalingArc extends SrxTrajectory {
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (2.00,13.50,0.00)
	// (5.00,16.50,89.99)
	
    public TurnScalingArc() {
		super();
		this.highGear = false;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public TurnScalingArc(boolean flipped) {
		super();
		this.highGear = false;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = false;

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
				{112.648,225.296,10.000,-0.010},
				{137.681,250.329,10.000,-0.010},
				{165.217,275.362,10.000,-0.010},
				{195.257,300.395,10.000,-0.020},
				{227.799,325.428,10.000,-0.030},
				{262.846,350.461,10.000,-0.030},
				{300.395,375.494,10.000,-0.040},
				{340.448,400.527,10.000,-0.060},
				{383.003,425.559,10.000,-0.070},
				{428.063,450.592,10.000,-0.090},
				{475.625,475.625,10.000,-0.110},
				{525.691,500.658,10.000,-0.130},
				{578.260,525.691,10.000,-0.160},
				{633.333,550.724,10.000,-0.190},
				{690.908,575.757,10.000,-0.230},
				{750.987,600.790,10.000,-0.270},
				{813.570,625.823,10.000,-0.320},
				{878.655,650.856,10.000,-0.370},
				{946.244,675.889,10.000,-0.430},
				{1016.336,700.921,10.000,-0.490},
				{1088.931,725.954,10.000,-0.570},
				{1164.030,750.987,10.000,-0.650},
				{1241.632,776.020,10.000,-0.730},
				{1321.738,801.053,10.000,-0.830},
				{1404.346,826.086,10.000,-0.940},
				{1489.458,851.119,10.000,-1.060},
				{1577.073,876.152,10.000,-1.180},
				{1667.192,901.185,10.000,-1.320},
				{1759.813,926.218,10.000,-1.480},
				{1853.687,938.734,10.000,-1.640},
				{1947.560,938.734,10.000,-1.810},
				{2041.434,938.734,10.000,-1.990},
				{2135.307,938.734,10.000,-2.180},
				{2229.180,938.734,10.000,-2.390},
				{2323.054,938.734,10.000,-2.600},
				{2416.927,938.734,10.000,-2.820},
				{2510.801,938.734,10.000,-3.050},
				{2604.674,938.734,10.000,-3.290},
				{2698.547,938.734,10.000,-3.540},
				{2792.421,938.734,10.000,-3.800},
				{2886.294,938.734,10.000,-4.070},
				{2980.168,938.734,10.000,-4.350},
				{3074.041,938.734,10.000,-4.650},
				{3167.915,938.734,10.000,-4.960},
				{3261.788,938.734,10.000,-5.270},
				{3355.661,938.734,10.000,-5.610},
				{3449.535,938.734,10.000,-5.950},
				{3543.408,938.734,10.000,-6.310},
				{3637.282,938.734,10.000,-6.680},
				{3731.155,938.734,10.000,-7.060},
				{3825.028,938.734,10.000,-7.460},
				{3918.902,938.734,10.000,-7.870},
				{4012.775,938.734,10.000,-8.300},
				{4106.649,938.734,10.000,-8.740},
				{4200.522,938.734,10.000,-9.200},
				{4294.395,938.734,10.000,-9.670},
				{4388.269,938.734,10.000,-10.160},
				{4482.142,938.734,10.000,-10.670},
				{4576.016,938.734,10.000,-11.190},
				{4669.889,938.734,10.000,-11.740},
				{4763.762,938.734,10.000,-12.300},
				{4857.636,938.734,10.000,-12.880},
				{4951.509,938.734,10.000,-13.480},
				{5045.383,938.734,10.000,-14.100},
				{5139.256,938.734,10.000,-14.740},
				{5233.129,938.734,10.000,-15.400},
				{5327.003,938.734,10.000,-16.080},
				{5420.876,938.734,10.000,-16.780},
				{5514.750,938.734,10.000,-17.510},
				{5608.623,938.734,10.000,-18.260},
				{5702.496,938.734,10.000,-19.030},
				{5796.370,938.734,10.000,-19.820},
				{5890.243,938.734,10.000,-20.640},
				{5984.117,938.734,10.000,-21.480},
				{6077.990,938.734,10.000,-22.340},
				{6171.863,938.734,10.000,-23.230},
				{6265.737,938.734,10.000,-24.150},
				{6359.610,938.734,10.000,-25.080},
				{6453.484,938.734,10.000,-26.040},
				{6547.357,938.734,10.000,-27.030},
				{6641.231,938.734,10.000,-28.040},
				{6735.104,938.734,10.000,-29.060},
				{6828.977,938.734,10.000,-30.120},
				{6922.851,938.734,10.000,-31.190},
				{7016.724,938.734,10.000,-32.280},
				{7110.598,938.734,10.000,-33.390},
				{7204.471,938.734,10.000,-34.520},
				{7298.344,938.734,10.000,-35.670},
				{7392.218,938.734,10.000,-36.830},
				{7486.091,938.734,10.000,-38.000},
				{7579.965,938.734,10.000,-39.190},
				{7673.838,938.734,10.000,-40.380},
				{7767.711,938.734,10.000,-41.590},
				{7861.585,938.734,10.000,-42.800},
				{7955.458,938.734,10.000,-44.010},
				{8049.332,938.734,10.000,-45.220},
				{8143.205,938.734,10.000,-46.440},
				{8237.078,938.734,10.000,-47.650},
				{8330.952,938.734,10.000,-48.860},
				{8424.825,938.734,10.000,-50.060},
				{8518.699,938.734,10.000,-51.250},
				{8612.572,938.734,10.000,-52.430},
				{8706.445,938.734,10.000,-53.600},
				{8800.319,938.734,10.000,-54.760},
				{8894.192,938.734,10.000,-55.900},
				{8988.066,938.734,10.000,-57.020},
				{9081.939,938.734,10.000,-58.120},
				{9175.812,938.734,10.000,-59.210},
				{9269.686,938.734,10.000,-60.270},
				{9363.559,938.734,10.000,-61.320},
				{9457.433,938.734,10.000,-62.340},
				{9551.306,938.734,10.000,-63.340},
				{9645.179,938.734,10.000,-64.310},
				{9739.053,938.734,10.000,-65.260},
				{9832.926,938.734,10.000,-66.190},
				{9926.800,938.734,10.000,-67.090},
				{10020.673,938.734,10.000,-67.970},
				{10114.546,938.734,10.000,-68.830},
				{10208.420,938.734,10.000,-69.660},
				{10302.293,938.734,10.000,-70.470},
				{10396.167,938.734,10.000,-71.260},
				{10490.040,938.734,10.000,-72.020},
				{10583.914,938.734,10.000,-72.760},
				{10677.787,938.734,10.000,-73.470},
				{10771.660,938.734,10.000,-74.170},
				{10865.534,938.734,10.000,-74.840},
				{10959.407,938.734,10.000,-75.500},
				{11053.281,938.734,10.000,-76.130},
				{11147.154,938.734,10.000,-76.740},
				{11241.027,938.734,10.000,-77.330},
				{11334.901,938.734,10.000,-77.900},
				{11428.774,938.734,10.000,-78.460},
				{11522.648,938.734,10.000,-79.000},
				{11616.521,938.734,10.000,-79.510},
				{11710.394,938.734,10.000,-80.010},
				{11804.268,938.734,10.000,-80.500},
				{11898.141,938.734,10.000,-80.970},
				{11992.015,938.734,10.000,-81.420},
				{12085.888,938.734,10.000,-81.850},
				{12179.761,938.734,10.000,-82.280},
				{12273.635,938.734,10.000,-82.680},
				{12367.508,938.734,10.000,-83.070},
				{12461.382,938.734,10.000,-83.450},
				{12555.255,938.734,10.000,-83.820},
				{12649.128,938.734,10.000,-84.170},
				{12743.002,938.734,10.000,-84.510},
				{12836.875,938.734,10.000,-84.840},
				{12930.749,938.734,10.000,-85.150},
				{13024.622,938.734,10.000,-85.450},
				{13118.495,938.734,10.000,-85.740},
				{13212.369,938.734,10.000,-86.020},
				{13306.242,938.734,10.000,-86.290},
				{13400.116,938.734,10.000,-86.550},
				{13493.989,938.734,10.000,-86.790},
				{13587.862,938.734,10.000,-87.030},
				{13681.736,938.734,10.000,-87.260},
				{13775.609,938.734,10.000,-87.470},
				{13869.483,938.734,10.000,-87.680},
				{13963.356,938.734,10.000,-87.880},
				{14057.230,938.734,10.000,-88.060},
				{14151.103,938.734,10.000,-88.240},
				{14244.976,938.734,10.000,-88.410},
				{14338.850,938.734,10.000,-88.570},
				{14432.723,938.734,10.000,-88.720},
				{14524.093,913.701,10.000,-88.860},
				{14612.960,888.668,10.000,-88.990},
				{14699.324,863.635,10.000,-89.100},
				{14783.184,838.602,10.000,-89.210},
				{14864.541,813.570,10.000,-89.300},
				{14943.394,788.537,10.000,-89.390},
				{15019.745,763.504,10.000,-89.470},
				{15093.592,738.471,10.000,-89.540},
				{15164.936,713.438,10.000,-89.600},
				{15233.776,688.405,10.000,-89.660},
				{15300.113,663.372,10.000,-89.710},
				{15363.947,638.339,10.000,-89.750},
				{15425.278,613.306,10.000,-89.790},
				{15484.105,588.273,10.000,-89.830},
				{15540.429,563.240,10.000,-89.860},
				{15594.250,538.208,10.000,-89.880},
				{15645.568,513.175,10.000,-89.910},
				{15694.382,488.142,10.000,-89.920},
				{15740.693,463.109,10.000,-89.940},
				{15784.500,438.076,10.000,-89.950},
				{15825.804,413.043,10.000,-89.960},
				{15864.605,388.010,10.000,-89.970},
				{15900.903,362.977,10.000,-89.980},
				{15934.698,337.944,10.000,-89.980},
				{15965.989,312.911,10.000,-89.990},
				{15994.777,287.878,10.000,-89.990},
				{16021.061,262.846,10.000,-89.990},
				{16044.842,237.813,10.000,-89.990},
				{16066.120,212.780,10.000,-89.990},
				{16084.895,187.747,10.000,-89.990},
				{16101.166,162.714,10.000,-89.990},
				{16114.935,137.681,10.000,-89.990},
				{16126.199,112.648,10.000,-89.990},
				{16134.961,87.615,10.000,-89.990},
				{16141.219,62.582,10.000,-89.990}		};

}