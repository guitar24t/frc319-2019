package frc.arcs;

import com.team319.follower.SrxMotionProfile;
import com.team319.follower.SrxTrajectory;

public class SpeedTestingArc extends SrxTrajectory {
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (2.00,13.50,0.00)
	// (5.00,16.50,89.99)
	// (2.00,19.50,179.98)
	
    public SpeedTestingArc() {
		super();
		this.highGear = false;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public SpeedTestingArc(boolean flipped) {
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
				{14526.597,938.734,10.000,-88.860},
				{14620.470,938.734,10.000,-89.000},
				{14711.840,913.701,10.000,-89.120},
				{14800.707,888.668,10.000,-89.230},
				{14887.070,863.635,10.000,-89.330},
				{14970.931,838.602,10.000,-89.420},
				{15052.288,813.570,10.000,-89.500},
				{15131.141,788.537,10.000,-89.570},
				{15207.492,763.504,10.000,-89.640},
				{15281.339,738.471,10.000,-89.700},
				{15352.683,713.438,10.000,-89.750},
				{15421.523,688.405,10.000,-89.790},
				{15487.860,663.372,10.000,-89.830},
				{15551.694,638.339,10.000,-89.860},
				{15613.025,613.306,10.000,-89.890},
				{15671.852,588.273,10.000,-89.920},
				{15728.176,563.240,10.000,-89.940},
				{15781.997,538.208,10.000,-89.950},
				{15833.314,513.175,10.000,-89.960},
				{15882.129,488.142,10.000,-89.970},
				{15928.439,463.109,10.000,-89.980},
				{15972.247,438.076,10.000,-89.990},
				{16013.551,413.043,10.000,-89.990},
				{16052.352,388.010,10.000,-89.990},
				{16088.650,362.977,10.000,-89.990},
				{16088.650,362.977,10.000,-89.990},
				{16119.941,312.911,10.000,-89.990},
				{16151.232,312.911,10.000,-89.990},
				{16182.523,312.911,10.000,-90.000},
				{16213.815,312.911,10.000,-90.000},
				{16245.106,312.911,10.000,-90.010},
				{16276.397,312.911,10.000,-90.010},
				{16307.688,312.911,10.000,-90.020},
				{16338.979,312.911,10.000,-90.030},
				{16370.270,312.911,10.000,-90.040},
				{16401.561,312.911,10.000,-90.040},
				{16432.852,312.911,10.000,-90.060},
				{16464.144,312.911,10.000,-90.070},
				{16495.435,312.911,10.000,-90.080},
				{16526.726,312.911,10.000,-90.090},
				{16558.017,312.911,10.000,-90.110},
				{16589.308,312.911,10.000,-90.120},
				{16620.599,312.911,10.000,-90.140},
				{16651.890,312.911,10.000,-90.160},
				{16683.182,312.911,10.000,-90.170},
				{16714.473,312.911,10.000,-90.190},
				{16745.764,312.911,10.000,-90.210},
				{16777.055,312.911,10.000,-90.230},
				{16808.346,312.911,10.000,-90.250},
				{16839.637,312.911,10.000,-90.280},
				{16870.928,312.911,10.000,-90.300},
				{16902.220,312.911,10.000,-90.330},
				{16933.511,312.911,10.000,-90.350},
				{16964.802,312.911,10.000,-90.380},
				{16996.093,312.911,10.000,-90.400},
				{17027.384,312.911,10.000,-90.430},
				{17058.675,312.911,10.000,-90.460},
				{17089.966,312.911,10.000,-90.490},
				{17121.257,312.911,10.000,-90.520},
				{17152.549,312.911,10.000,-90.550},
				{17183.840,312.911,10.000,-90.590},
				{17215.131,312.911,10.000,-90.620},
				{17246.422,312.911,10.000,-90.660},
				{17277.713,312.911,10.000,-90.690},
				{17309.004,312.911,10.000,-90.730},
				{17340.295,312.911,10.000,-90.770},
				{17371.587,312.911,10.000,-90.800},
				{17402.878,312.911,10.000,-90.840},
				{17434.169,312.911,10.000,-90.880},
				{17465.460,312.911,10.000,-90.920},
				{17496.751,312.911,10.000,-90.970},
				{17528.042,312.911,10.000,-91.010},
				{17559.333,312.911,10.000,-91.050},
				{17590.624,312.911,10.000,-91.100},
				{17621.916,312.911,10.000,-91.150},
				{17653.207,312.911,10.000,-91.190},
				{17684.498,312.911,10.000,-91.240},
				{17715.789,312.911,10.000,-91.290},
				{17747.080,312.911,10.000,-91.340},
				{17778.371,312.911,10.000,-91.390},
				{17809.662,312.911,10.000,-91.440},
				{17840.954,312.911,10.000,-91.500},
				{17872.245,312.911,10.000,-91.550},
				{17903.536,312.911,10.000,-91.600},
				{17934.827,312.911,10.000,-91.660},
				{17966.118,312.911,10.000,-91.720},
				{17997.409,312.911,10.000,-91.780},
				{18028.700,312.911,10.000,-91.830},
				{18059.992,312.911,10.000,-91.890},
				{18091.283,312.911,10.000,-91.960},
				{18122.574,312.911,10.000,-92.020},
				{18153.865,312.911,10.000,-92.080},
				{18185.156,312.911,10.000,-92.150},
				{18216.447,312.911,10.000,-92.210},
				{18247.738,312.911,10.000,-92.280},
				{18279.029,312.911,10.000,-92.340},
				{18310.321,312.911,10.000,-92.410},
				{18341.612,312.911,10.000,-92.480},
				{18372.903,312.911,10.000,-92.550},
				{18404.194,312.911,10.000,-92.620},
				{18435.485,312.911,10.000,-92.700},
				{18466.776,312.911,10.000,-92.770},
				{18498.067,312.911,10.000,-92.850},
				{18529.359,312.911,10.000,-92.920},
				{18560.650,312.911,10.000,-93.000},
				{18591.941,312.911,10.000,-93.080},
				{18623.232,312.911,10.000,-93.160},
				{18654.523,312.911,10.000,-93.240},
				{18685.814,312.911,10.000,-93.320},
				{18717.105,312.911,10.000,-93.400},
				{18748.396,312.911,10.000,-93.490},
				{18779.688,312.911,10.000,-93.570},
				{18810.979,312.911,10.000,-93.660},
				{18842.270,312.911,10.000,-93.750},
				{18873.561,312.911,10.000,-93.840},
				{18904.852,312.911,10.000,-93.930},
				{18936.143,312.911,10.000,-94.020},
				{18967.434,312.911,10.000,-94.110},
				{18998.726,312.911,10.000,-94.210},
				{19030.017,312.911,10.000,-94.300},
				{19061.308,312.911,10.000,-94.400},
				{19092.599,312.911,10.000,-94.500},
				{19123.890,312.911,10.000,-94.590},
				{19155.181,312.911,10.000,-94.690},
				{19186.472,312.911,10.000,-94.800},
				{19217.764,312.911,10.000,-94.900},
				{19249.055,312.911,10.000,-95.000},
				{19280.346,312.911,10.000,-95.110},
				{19311.637,312.911,10.000,-95.220},
				{19342.928,312.911,10.000,-95.320},
				{19374.219,312.911,10.000,-95.430},
				{19405.510,312.911,10.000,-95.550},
				{19436.801,312.911,10.000,-95.660},
				{19468.093,312.911,10.000,-95.770},
				{19499.384,312.911,10.000,-95.890},
				{19530.675,312.911,10.000,-96.000},
				{19561.966,312.911,10.000,-96.120},
				{19593.257,312.911,10.000,-96.240},
				{19624.548,312.911,10.000,-96.360},
				{19655.839,312.911,10.000,-96.490},
				{19687.131,312.911,10.000,-96.610},
				{19718.422,312.911,10.000,-96.740},
				{19749.713,312.911,10.000,-96.860},
				{19781.004,312.911,10.000,-96.990},
				{19812.295,312.911,10.000,-97.120},
				{19843.586,312.911,10.000,-97.250},
				{19874.877,312.911,10.000,-97.390},
				{19906.168,312.911,10.000,-97.520},
				{19937.460,312.911,10.000,-97.660},
				{19968.751,312.911,10.000,-97.800},
				{20000.042,312.911,10.000,-97.940},
				{20031.333,312.911,10.000,-98.080},
				{20062.624,312.911,10.000,-98.220},
				{20093.915,312.911,10.000,-98.370},
				{20125.206,312.911,10.000,-98.510},
				{20156.498,312.911,10.000,-98.660},
				{20187.789,312.911,10.000,-98.810},
				{20219.080,312.911,10.000,-98.970},
				{20250.371,312.911,10.000,-99.120},
				{20281.662,312.911,10.000,-99.270},
				{20312.953,312.911,10.000,-99.430},
				{20344.244,312.911,10.000,-99.590},
				{20375.536,312.911,10.000,-99.750},
				{20406.827,312.911,10.000,-99.910},
				{20438.118,312.911,10.000,-100.080},
				{20469.409,312.911,10.000,-100.250},
				{20500.700,312.911,10.000,-100.410},
				{20531.991,312.911,10.000,-100.580},
				{20563.282,312.911,10.000,-100.760},
				{20594.573,312.911,10.000,-100.930},
				{20625.865,312.911,10.000,-101.110},
				{20657.156,312.911,10.000,-101.280},
				{20688.447,312.911,10.000,-101.460},
				{20719.738,312.911,10.000,-101.650},
				{20751.029,312.911,10.000,-101.830},
				{20782.320,312.911,10.000,-102.020},
				{20813.611,312.911,10.000,-102.210},
				{20844.903,312.911,10.000,-102.400},
				{20876.194,312.911,10.000,-102.590},
				{20907.485,312.911,10.000,-102.780},
				{20938.776,312.911,10.000,-102.980},
				{20970.067,312.911,10.000,-103.180},
				{21001.358,312.911,10.000,-103.380},
				{21032.649,312.911,10.000,-103.580},
				{21063.940,312.911,10.000,-103.790},
				{21095.232,312.911,10.000,-104.000},
				{21126.523,312.911,10.000,-104.210},
				{21157.814,312.911,10.000,-104.420},
				{21189.105,312.911,10.000,-104.630},
				{21220.396,312.911,10.000,-104.850},
				{21251.687,312.911,10.000,-105.070},
				{21282.978,312.911,10.000,-105.290},
				{21314.270,312.911,10.000,-105.510},
				{21345.561,312.911,10.000,-105.740},
				{21376.852,312.911,10.000,-105.970},
				{21408.143,312.911,10.000,-106.200},
				{21439.434,312.911,10.000,-106.430},
				{21470.725,312.911,10.000,-106.670},
				{21502.016,312.911,10.000,-106.910},
				{21533.307,312.911,10.000,-107.150},
				{21564.599,312.911,10.000,-107.390},
				{21595.890,312.911,10.000,-107.640},
				{21627.181,312.911,10.000,-107.890},
				{21658.472,312.911,10.000,-108.140},
				{21689.763,312.911,10.000,-108.390},
				{21721.054,312.911,10.000,-108.650},
				{21752.345,312.911,10.000,-108.900},
				{21783.637,312.911,10.000,-109.170},
				{21814.928,312.911,10.000,-109.430},
				{21846.219,312.911,10.000,-109.700},
				{21877.510,312.911,10.000,-109.960},
				{21908.801,312.911,10.000,-110.240},
				{21940.092,312.911,10.000,-110.510},
				{21971.383,312.911,10.000,-110.790},
				{22002.675,312.911,10.000,-111.070},
				{22033.966,312.911,10.000,-111.350},
				{22065.257,312.911,10.000,-111.630},
				{22096.548,312.911,10.000,-111.920},
				{22127.839,312.911,10.000,-112.210},
				{22159.130,312.911,10.000,-112.500},
				{22190.421,312.911,10.000,-112.800},
				{22221.712,312.911,10.000,-113.100},
				{22253.004,312.911,10.000,-113.400},
				{22284.295,312.911,10.000,-113.700},
				{22315.586,312.911,10.000,-114.010},
				{22346.877,312.911,10.000,-114.310},
				{22378.168,312.911,10.000,-114.620},
				{22409.459,312.911,10.000,-114.940},
				{22440.750,312.911,10.000,-115.260},
				{22472.042,312.911,10.000,-115.570},
				{22503.333,312.911,10.000,-115.900},
				{22534.624,312.911,10.000,-116.220},
				{22565.915,312.911,10.000,-116.550},
				{22597.206,312.911,10.000,-116.880},
				{22628.497,312.911,10.000,-117.210},
				{22659.788,312.911,10.000,-117.540},
				{22691.079,312.911,10.000,-117.880},
				{22722.371,312.911,10.000,-118.220},
				{22753.662,312.911,10.000,-118.560},
				{22784.953,312.911,10.000,-118.910},
				{22816.244,312.911,10.000,-119.250},
				{22847.535,312.911,10.000,-119.600},
				{22878.826,312.911,10.000,-119.950},
				{22910.117,312.911,10.000,-120.310},
				{22941.409,312.911,10.000,-120.670},
				{22972.700,312.911,10.000,-121.020},
				{23003.991,312.911,10.000,-121.390},
				{23035.282,312.911,10.000,-121.750},
				{23066.573,312.911,10.000,-122.110},
				{23097.864,312.911,10.000,-122.480},
				{23129.155,312.911,10.000,-122.850},
				{23160.447,312.911,10.000,-123.220},
				{23191.738,312.911,10.000,-123.600},
				{23223.029,312.911,10.000,-123.970},
				{23254.320,312.911,10.000,-124.350},
				{23285.611,312.911,10.000,-124.730},
				{23316.902,312.911,10.000,-125.110},
				{23348.193,312.911,10.000,-125.490},
				{23379.484,312.911,10.000,-125.880},
				{23410.776,312.911,10.000,-126.260},
				{23442.067,312.911,10.000,-126.650},
				{23473.358,312.911,10.000,-127.040},
				{23504.649,312.911,10.000,-127.430},
				{23535.940,312.911,10.000,-127.820},
				{23567.231,312.911,10.000,-128.220},
				{23598.522,312.911,10.000,-128.610},
				{23629.814,312.911,10.000,-129.010},
				{23661.105,312.911,10.000,-129.410},
				{23692.396,312.911,10.000,-129.800},
				{23723.687,312.911,10.000,-130.200},
				{23754.978,312.911,10.000,-130.600},
				{23786.269,312.911,10.000,-131.000},
				{23817.560,312.911,10.000,-131.410},
				{23848.851,312.911,10.000,-131.810},
				{23880.143,312.911,10.000,-132.210},
				{23911.434,312.911,10.000,-132.610},
				{23942.725,312.911,10.000,-133.020},
				{23974.016,312.911,10.000,-133.420},
				{24005.307,312.911,10.000,-133.830},
				{24036.598,312.911,10.000,-134.230},
				{24067.889,312.911,10.000,-134.640},
				{24099.181,312.911,10.000,-135.040},
				{24130.472,312.911,10.000,-135.450},
				{24161.763,312.911,10.000,-135.850},
				{24193.054,312.911,10.000,-136.260},
				{24224.345,312.911,10.000,-136.660},
				{24255.636,312.911,10.000,-137.070},
				{24286.927,312.911,10.000,-137.470},
				{24318.219,312.911,10.000,-137.870},
				{24349.510,312.911,10.000,-138.280},
				{24380.801,312.911,10.000,-138.680},
				{24412.092,312.911,10.000,-139.080},
				{24443.383,312.911,10.000,-139.480},
				{24474.674,312.911,10.000,-139.880},
				{24505.965,312.911,10.000,-140.280},
				{24537.256,312.911,10.000,-140.680},
				{24568.548,312.911,10.000,-141.070},
				{24599.839,312.911,10.000,-141.470},
				{24631.130,312.911,10.000,-141.860},
				{24662.421,312.911,10.000,-142.260},
				{24693.712,312.911,10.000,-142.650},
				{24725.003,312.911,10.000,-143.040},
				{24756.294,312.911,10.000,-143.430},
				{24787.586,312.911,10.000,-143.810},
				{24818.877,312.911,10.000,-144.200},
				{24850.168,312.911,10.000,-144.580},
				{24881.459,312.911,10.000,-144.970},
				{24912.750,312.911,10.000,-145.350},
				{24944.041,312.911,10.000,-145.730},
				{24975.332,312.911,10.000,-146.100},
				{25006.623,312.911,10.000,-146.480},
				{25037.915,312.911,10.000,-146.850},
				{25069.206,312.911,10.000,-147.220},
				{25100.497,312.911,10.000,-147.590},
				{25131.788,312.911,10.000,-147.960},
				{25163.079,312.911,10.000,-148.320},
				{25194.370,312.911,10.000,-148.690},
				{25225.661,312.911,10.000,-149.050},
				{25256.953,312.911,10.000,-149.400},
				{25288.244,312.911,10.000,-149.760},
				{25319.535,312.911,10.000,-150.110},
				{25350.826,312.911,10.000,-150.460},
				{25382.117,312.911,10.000,-150.810},
				{25413.408,312.911,10.000,-151.160},
				{25444.699,312.911,10.000,-151.500},
				{25475.991,312.911,10.000,-151.840},
				{25507.282,312.911,10.000,-152.180},
				{25538.573,312.911,10.000,-152.520},
				{25569.864,312.911,10.000,-152.850},
				{25601.155,312.911,10.000,-153.190},
				{25632.446,312.911,10.000,-153.510},
				{25663.737,312.911,10.000,-153.840},
				{25695.028,312.911,10.000,-154.160},
				{25726.320,312.911,10.000,-154.480},
				{25757.611,312.911,10.000,-154.800},
				{25788.902,312.911,10.000,-155.120},
				{25820.193,312.911,10.000,-155.430},
				{25851.484,312.911,10.000,-155.740},
				{25882.775,312.911,10.000,-156.050},
				{25914.066,312.911,10.000,-156.350},
				{25945.358,312.911,10.000,-156.660},
				{25976.649,312.911,10.000,-156.960},
				{26007.940,312.911,10.000,-157.250},
				{26039.231,312.911,10.000,-157.550},
				{26070.522,312.911,10.000,-157.840},
				{26101.813,312.911,10.000,-158.130},
				{26133.104,312.911,10.000,-158.420},
				{26164.395,312.911,10.000,-158.700},
				{26195.687,312.911,10.000,-158.980},
				{26226.978,312.911,10.000,-159.260},
				{26258.269,312.911,10.000,-159.530},
				{26289.560,312.911,10.000,-159.810},
				{26320.851,312.911,10.000,-160.080},
				{26352.142,312.911,10.000,-160.350},
				{26383.433,312.911,10.000,-160.610},
				{26414.725,312.911,10.000,-160.870},
				{26446.016,312.911,10.000,-161.140},
				{26477.307,312.911,10.000,-161.390},
				{26508.598,312.911,10.000,-161.650},
				{26539.889,312.911,10.000,-161.900},
				{26571.180,312.911,10.000,-162.150},
				{26602.471,312.911,10.000,-162.400},
				{26633.763,312.911,10.000,-162.640},
				{26665.054,312.911,10.000,-162.890},
				{26696.345,312.911,10.000,-163.130},
				{26727.636,312.911,10.000,-163.360},
				{26758.927,312.911,10.000,-163.600},
				{26790.218,312.911,10.000,-163.830},
				{26821.509,312.911,10.000,-164.060},
				{26852.800,312.911,10.000,-164.290},
				{26884.092,312.911,10.000,-164.510},
				{26915.383,312.911,10.000,-164.740},
				{26946.674,312.911,10.000,-164.960},
				{26977.965,312.911,10.000,-165.180},
				{27009.256,312.911,10.000,-165.390},
				{27040.547,312.911,10.000,-165.610},
				{27071.838,312.911,10.000,-165.820},
				{27103.130,312.911,10.000,-166.030},
				{27134.421,312.911,10.000,-166.240},
				{27165.712,312.911,10.000,-166.440},
				{27197.003,312.911,10.000,-166.640},
				{27228.294,312.911,10.000,-166.840},
				{27259.585,312.911,10.000,-167.040},
				{27290.876,312.911,10.000,-167.240},
				{27322.167,312.911,10.000,-167.430},
				{27353.459,312.911,10.000,-167.620},
				{27384.750,312.911,10.000,-167.810},
				{27416.041,312.911,10.000,-168.000},
				{27447.332,312.911,10.000,-168.190},
				{27478.623,312.911,10.000,-168.370},
				{27509.914,312.911,10.000,-168.550},
				{27541.205,312.911,10.000,-168.730},
				{27572.497,312.911,10.000,-168.910},
				{27603.788,312.911,10.000,-169.080},
				{27635.079,312.911,10.000,-169.260},
				{27666.370,312.911,10.000,-169.430},
				{27697.661,312.911,10.000,-169.600},
				{27728.952,312.911,10.000,-169.770},
				{27760.243,312.911,10.000,-169.930},
				{27791.535,312.911,10.000,-170.100},
				{27822.826,312.911,10.000,-170.260},
				{27854.117,312.911,10.000,-170.420},
				{27885.408,312.911,10.000,-170.580},
				{27916.699,312.911,10.000,-170.730},
				{27947.990,312.911,10.000,-170.890},
				{27979.281,312.911,10.000,-171.040},
				{28010.572,312.911,10.000,-171.190},
				{28041.864,312.911,10.000,-171.340},
				{28073.155,312.911,10.000,-171.490},
				{28104.446,312.911,10.000,-171.640},
				{28135.737,312.911,10.000,-171.780},
				{28167.028,312.911,10.000,-171.920},
				{28198.319,312.911,10.000,-172.070},
				{28229.610,312.911,10.000,-172.210},
				{28260.902,312.911,10.000,-172.340},
				{28292.193,312.911,10.000,-172.480},
				{28323.484,312.911,10.000,-172.610},
				{28354.775,312.911,10.000,-172.750},
				{28386.066,312.911,10.000,-172.880},
				{28417.357,312.911,10.000,-173.010},
				{28448.648,312.911,10.000,-173.140},
				{28479.939,312.911,10.000,-173.260},
				{28511.231,312.911,10.000,-173.390},
				{28542.522,312.911,10.000,-173.510},
				{28573.813,312.911,10.000,-173.630},
				{28605.104,312.911,10.000,-173.760},
				{28636.395,312.911,10.000,-173.870},
				{28667.686,312.911,10.000,-173.990},
				{28698.977,312.911,10.000,-174.110},
				{28730.269,312.911,10.000,-174.220},
				{28761.560,312.911,10.000,-174.340},
				{28792.851,312.911,10.000,-174.450},
				{28824.142,312.911,10.000,-174.560},
				{28855.433,312.911,10.000,-174.670},
				{28886.724,312.911,10.000,-174.780},
				{28918.015,312.911,10.000,-174.880},
				{28949.307,312.911,10.000,-174.990},
				{28980.598,312.911,10.000,-175.090},
				{29011.889,312.911,10.000,-175.200},
				{29043.180,312.911,10.000,-175.300},
				{29074.471,312.911,10.000,-175.400},
				{29105.762,312.911,10.000,-175.500},
				{29137.053,312.911,10.000,-175.590},
				{29168.344,312.911,10.000,-175.690},
				{29199.636,312.911,10.000,-175.780},
				{29230.927,312.911,10.000,-175.880},
				{29262.218,312.911,10.000,-175.970},
				{29293.509,312.911,10.000,-176.060},
				{29324.800,312.911,10.000,-176.150},
				{29356.091,312.911,10.000,-176.240},
				{29387.382,312.911,10.000,-176.330},
				{29418.674,312.911,10.000,-176.410},
				{29449.965,312.911,10.000,-176.500},
				{29481.256,312.911,10.000,-176.580},
				{29512.547,312.911,10.000,-176.670},
				{29543.838,312.911,10.000,-176.750},
				{29575.129,312.911,10.000,-176.830},
				{29606.420,312.911,10.000,-176.910},
				{29637.711,312.911,10.000,-176.990},
				{29669.003,312.911,10.000,-177.060},
				{29700.294,312.911,10.000,-177.140},
				{29731.585,312.911,10.000,-177.210},
				{29762.876,312.911,10.000,-177.290},
				{29794.167,312.911,10.000,-177.360},
				{29825.458,312.911,10.000,-177.430},
				{29856.749,312.911,10.000,-177.500},
				{29888.041,312.911,10.000,-177.570},
				{29919.332,312.911,10.000,-177.640},
				{29950.623,312.911,10.000,-177.710},
				{29981.914,312.911,10.000,-177.770},
				{30013.205,312.911,10.000,-177.840},
				{30044.496,312.911,10.000,-177.900},
				{30075.787,312.911,10.000,-177.960},
				{30107.079,312.911,10.000,-178.030},
				{30138.370,312.911,10.000,-178.090},
				{30169.661,312.911,10.000,-178.150},
				{30200.952,312.911,10.000,-178.210},
				{30232.243,312.911,10.000,-178.260},
				{30263.534,312.911,10.000,-178.320},
				{30294.825,312.911,10.000,-178.380},
				{30326.116,312.911,10.000,-178.430},
				{30357.408,312.911,10.000,-178.480},
				{30388.699,312.911,10.000,-178.540},
				{30419.990,312.911,10.000,-178.590},
				{30451.281,312.911,10.000,-178.640},
				{30482.572,312.911,10.000,-178.690},
				{30513.863,312.911,10.000,-178.740},
				{30545.154,312.911,10.000,-178.790},
				{30576.446,312.911,10.000,-178.830},
				{30607.737,312.911,10.000,-178.880},
				{30639.028,312.911,10.000,-178.920},
				{30670.319,312.911,10.000,-178.970},
				{30701.610,312.911,10.000,-179.010},
				{30732.901,312.911,10.000,-179.050},
				{30764.192,312.911,10.000,-179.090},
				{30795.483,312.911,10.000,-179.130},
				{30826.775,312.911,10.000,-179.170},
				{30858.066,312.911,10.000,-179.210},
				{30889.357,312.911,10.000,-179.250},
				{30920.648,312.911,10.000,-179.280},
				{30951.939,312.911,10.000,-179.320},
				{30983.230,312.911,10.000,-179.350},
				{31014.521,312.911,10.000,-179.390},
				{31045.813,312.911,10.000,-179.420},
				{31077.104,312.911,10.000,-179.450},
				{31108.395,312.911,10.000,-179.480},
				{31139.686,312.911,10.000,-179.510},
				{31170.977,312.911,10.000,-179.540},
				{31202.268,312.911,10.000,-179.570},
				{31233.559,312.911,10.000,-179.600},
				{31264.850,312.911,10.000,-179.620},
				{31296.142,312.911,10.000,-179.650},
				{31327.433,312.911,10.000,-179.670},
				{31358.724,312.911,10.000,-179.700},
				{31390.015,312.911,10.000,-179.720},
				{31421.306,312.911,10.000,-179.740},
				{31452.597,312.911,10.000,-179.760},
				{31483.888,312.911,10.000,-179.780},
				{31515.180,312.911,10.000,-179.800},
				{31546.471,312.911,10.000,-179.820},
				{31577.762,312.911,10.000,-179.830},
				{31609.053,312.911,10.000,-179.850},
				{31640.344,312.911,10.000,-179.860},
				{31671.635,312.911,10.000,-179.880},
				{31702.926,312.911,10.000,-179.890},
				{31734.218,312.911,10.000,-179.900},
				{31765.509,312.911,10.000,-179.920},
				{31796.800,312.911,10.000,-179.930},
				{31828.091,312.911,10.000,-179.940},
				{31859.382,312.911,10.000,-179.940},
				{31890.673,312.911,10.000,-179.950},
				{31921.964,312.911,10.000,-179.960},
				{31953.255,312.911,10.000,-179.960},
				{31982.043,287.878,10.000,-179.970},
				{32008.328,262.846,10.000,-179.970},
				{32032.109,237.813,10.000,-179.980},
				{32053.387,212.780,10.000,-179.980},
				{32072.162,187.747,10.000,-179.980},
				{32088.433,162.714,10.000,-179.980},
				{32102.201,137.681,10.000,-179.980},
				{32113.466,112.648,10.000,-179.980},
				{32122.228,87.615,10.000,-179.980},
				{32128.486,62.582,10.000,-179.980},
				{32132.241,37.549,10.000,-179.980}		};

}