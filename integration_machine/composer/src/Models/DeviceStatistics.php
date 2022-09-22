<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTEGRATION_MACHINE\Models;

use AlibabaCloud\Tea\Model;

class DeviceStatistics extends Model
{
    // 设备SN号
    /**
     * @example 12345567745
     *
     * @var string
     */
    public $serialNo;

    // 设备状态(初始化:init,在线:online,离线:offline,故障:fault)
    /**
     * @example online
     *
     * @var string
     */
    public $status;

    // 通行人次
    /**
     * @example 100
     *
     * @var int
     */
    public $total;

    // 绿码人次
    /**
     * @example 100
     *
     * @var int
     */
    public $green;

    // 黄码人次
    /**
     * @example 100
     *
     * @var int
     */
    public $yellow;

    // 红码人次
    /**
     * @example 100
     *
     * @var int
     */
    public $red;

    // 码值异常人次
    /**
     * @example 100
     *
     * @var int
     */
    public $codeErr;

    // 刷脸人次
    /**
     * @example 100
     *
     * @var int
     */
    public $face;

    // 刷健康码人次
    /**
     * @example 100
     *
     * @var int
     */
    public $healthCode;

    // 刷身份证人次
    /**
     * @example 100
     *
     * @var int
     */
    public $cert;

    // 其他方式人次
    /**
     * @example 100
     *
     * @var int
     */
    public $otherMode;

    // 通行成功人次
    /**
     * @example 100
     *
     * @var int
     */
    public $pass;

    // 通行失败人次
    /**
     * @example 100
     *
     * @var int
     */
    public $stop;

    // 平均通行时间(ms)
    /**
     * @example 1000
     *
     * @var int
     */
    public $avgTime;

    // 疫苗未接种人次
    /**
     * @example 100
     *
     * @var int
     */
    public $vaccineNo;

    // 疫苗接种一针人次
    /**
     * @example 100
     *
     * @var int
     */
    public $vaccineFirst;

    // 疫苗接种两针人次
    /**
     * @example 100
     *
     * @var int
     */
    public $vaccineSecond;

    // 疫苗接种三针人次
    /**
     * @example 100
     *
     * @var int
     */
    public $vaccineThird;

    // 疫苗未查询人次
    /**
     * @example 100
     *
     * @var int
     */
    public $vaccineUnknown;

    // 核酸有效期24h人次
    /**
     * @example 100
     *
     * @var int
     */
    public $nucleicAcid24h;

    // 核酸有效期48h人次
    /**
     * @example 100
     *
     * @var int
     */
    public $nucleicAcid48h;

    // 核酸有效期72h人次
    /**
     * @example 100
     *
     * @var int
     */
    public $nucleicAcid72h;

    // 核酸有效期7d人次
    /**
     * @example 100
     *
     * @var int
     */
    public $nucleicAcid7d;

    // 超过7D或无核酸人次
    /**
     * @example 100
     *
     * @var int
     */
    public $nucleicAcidOther;

    // 体温小于35.5人次
    /**
     * @example 100
     *
     * @var int
     */
    public $temperatureA;

    // 体温35.5-36度人次
    /**
     * @example 100
     *
     * @var int
     */
    public $temperatureB;

    // 体温36.1-36.3度人次
    /**
     * @example 100
     *
     * @var int
     */
    public $temperatureC;

    // 体温36.4-36.7度人次
    /**
     * @example 100
     *
     * @var int
     */
    public $temperatureD;

    // 体温36.8-37度人次
    /**
     * @example 100
     *
     * @var int
     */
    public $temperatureE;

    // 体温37.1-37.5度人次
    /**
     * @example 100
     *
     * @var int
     */
    public $temperatureF;

    // 体温37.6-38度人次
    /**
     * @example 100
     *
     * @var int
     */
    public $temperatureG;

    // 体温38.1-38.5度人次
    /**
     * @example 100
     *
     * @var int
     */
    public $temperatureH;

    // 体温38.6-39度人次
    /**
     * @example 100
     *
     * @var int
     */
    public $temperatureI;

    // 体温大于39人次
    /**
     * @example 100
     *
     * @var int
     */
    public $temperatureJ;

    // 体温未获取人次
    /**
     * @example 100
     *
     * @var int
     */
    public $temperatureK;

    // 户籍所在省分布
    /**
     * @example
     *
     * @var IdentityDistributed[]
     */
    public $identityDistributedList;

    // 扩展统计字段
    /**
     * @example
     *
     * @var StatisticsExtendArg[]
     */
    public $extendArgList;
    protected $_name = [
        'serialNo'                => 'serial_no',
        'status'                  => 'status',
        'total'                   => 'total',
        'green'                   => 'green',
        'yellow'                  => 'yellow',
        'red'                     => 'red',
        'codeErr'                 => 'code_err',
        'face'                    => 'face',
        'healthCode'              => 'health_code',
        'cert'                    => 'cert',
        'otherMode'               => 'other_mode',
        'pass'                    => 'pass',
        'stop'                    => 'stop',
        'avgTime'                 => 'avg_time',
        'vaccineNo'               => 'vaccine_no',
        'vaccineFirst'            => 'vaccine_first',
        'vaccineSecond'           => 'vaccine_second',
        'vaccineThird'            => 'vaccine_third',
        'vaccineUnknown'          => 'vaccine_unknown',
        'nucleicAcid24h'          => 'nucleic_acid24h',
        'nucleicAcid48h'          => 'nucleic_acid48h',
        'nucleicAcid72h'          => 'nucleic_acid72h',
        'nucleicAcid7d'           => 'nucleic_acid7d',
        'nucleicAcidOther'        => 'nucleic_acid_other',
        'temperatureA'            => 'temperature_a',
        'temperatureB'            => 'temperature_b',
        'temperatureC'            => 'temperature_c',
        'temperatureD'            => 'temperature_d',
        'temperatureE'            => 'temperature_e',
        'temperatureF'            => 'temperature_f',
        'temperatureG'            => 'temperature_g',
        'temperatureH'            => 'temperature_h',
        'temperatureI'            => 'temperature_i',
        'temperatureJ'            => 'temperature_j',
        'temperatureK'            => 'temperature_k',
        'identityDistributedList' => 'identity_distributed_list',
        'extendArgList'           => 'extend_arg_list',
    ];

    public function validate()
    {
        Model::validateRequired('serialNo', $this->serialNo, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('total', $this->total, true);
        Model::validateRequired('green', $this->green, true);
        Model::validateRequired('yellow', $this->yellow, true);
        Model::validateRequired('red', $this->red, true);
        Model::validateRequired('codeErr', $this->codeErr, true);
        Model::validateRequired('face', $this->face, true);
        Model::validateRequired('healthCode', $this->healthCode, true);
        Model::validateRequired('cert', $this->cert, true);
        Model::validateRequired('otherMode', $this->otherMode, true);
        Model::validateRequired('pass', $this->pass, true);
        Model::validateRequired('stop', $this->stop, true);
        Model::validateRequired('avgTime', $this->avgTime, true);
        Model::validateRequired('vaccineNo', $this->vaccineNo, true);
        Model::validateRequired('vaccineFirst', $this->vaccineFirst, true);
        Model::validateRequired('vaccineSecond', $this->vaccineSecond, true);
        Model::validateRequired('vaccineThird', $this->vaccineThird, true);
        Model::validateRequired('vaccineUnknown', $this->vaccineUnknown, true);
        Model::validateRequired('nucleicAcid24h', $this->nucleicAcid24h, true);
        Model::validateRequired('nucleicAcid48h', $this->nucleicAcid48h, true);
        Model::validateRequired('nucleicAcid72h', $this->nucleicAcid72h, true);
        Model::validateRequired('nucleicAcid7d', $this->nucleicAcid7d, true);
        Model::validateRequired('nucleicAcidOther', $this->nucleicAcidOther, true);
        Model::validateRequired('temperatureA', $this->temperatureA, true);
        Model::validateRequired('temperatureB', $this->temperatureB, true);
        Model::validateRequired('temperatureC', $this->temperatureC, true);
        Model::validateRequired('temperatureD', $this->temperatureD, true);
        Model::validateRequired('temperatureE', $this->temperatureE, true);
        Model::validateRequired('temperatureF', $this->temperatureF, true);
        Model::validateRequired('temperatureG', $this->temperatureG, true);
        Model::validateRequired('temperatureH', $this->temperatureH, true);
        Model::validateRequired('temperatureI', $this->temperatureI, true);
        Model::validateRequired('temperatureJ', $this->temperatureJ, true);
        Model::validateRequired('temperatureK', $this->temperatureK, true);
        Model::validateRequired('identityDistributedList', $this->identityDistributedList, true);
        Model::validateRequired('extendArgList', $this->extendArgList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->serialNo) {
            $res['serial_no'] = $this->serialNo;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->green) {
            $res['green'] = $this->green;
        }
        if (null !== $this->yellow) {
            $res['yellow'] = $this->yellow;
        }
        if (null !== $this->red) {
            $res['red'] = $this->red;
        }
        if (null !== $this->codeErr) {
            $res['code_err'] = $this->codeErr;
        }
        if (null !== $this->face) {
            $res['face'] = $this->face;
        }
        if (null !== $this->healthCode) {
            $res['health_code'] = $this->healthCode;
        }
        if (null !== $this->cert) {
            $res['cert'] = $this->cert;
        }
        if (null !== $this->otherMode) {
            $res['other_mode'] = $this->otherMode;
        }
        if (null !== $this->pass) {
            $res['pass'] = $this->pass;
        }
        if (null !== $this->stop) {
            $res['stop'] = $this->stop;
        }
        if (null !== $this->avgTime) {
            $res['avg_time'] = $this->avgTime;
        }
        if (null !== $this->vaccineNo) {
            $res['vaccine_no'] = $this->vaccineNo;
        }
        if (null !== $this->vaccineFirst) {
            $res['vaccine_first'] = $this->vaccineFirst;
        }
        if (null !== $this->vaccineSecond) {
            $res['vaccine_second'] = $this->vaccineSecond;
        }
        if (null !== $this->vaccineThird) {
            $res['vaccine_third'] = $this->vaccineThird;
        }
        if (null !== $this->vaccineUnknown) {
            $res['vaccine_unknown'] = $this->vaccineUnknown;
        }
        if (null !== $this->nucleicAcid24h) {
            $res['nucleic_acid24h'] = $this->nucleicAcid24h;
        }
        if (null !== $this->nucleicAcid48h) {
            $res['nucleic_acid48h'] = $this->nucleicAcid48h;
        }
        if (null !== $this->nucleicAcid72h) {
            $res['nucleic_acid72h'] = $this->nucleicAcid72h;
        }
        if (null !== $this->nucleicAcid7d) {
            $res['nucleic_acid7d'] = $this->nucleicAcid7d;
        }
        if (null !== $this->nucleicAcidOther) {
            $res['nucleic_acid_other'] = $this->nucleicAcidOther;
        }
        if (null !== $this->temperatureA) {
            $res['temperature_a'] = $this->temperatureA;
        }
        if (null !== $this->temperatureB) {
            $res['temperature_b'] = $this->temperatureB;
        }
        if (null !== $this->temperatureC) {
            $res['temperature_c'] = $this->temperatureC;
        }
        if (null !== $this->temperatureD) {
            $res['temperature_d'] = $this->temperatureD;
        }
        if (null !== $this->temperatureE) {
            $res['temperature_e'] = $this->temperatureE;
        }
        if (null !== $this->temperatureF) {
            $res['temperature_f'] = $this->temperatureF;
        }
        if (null !== $this->temperatureG) {
            $res['temperature_g'] = $this->temperatureG;
        }
        if (null !== $this->temperatureH) {
            $res['temperature_h'] = $this->temperatureH;
        }
        if (null !== $this->temperatureI) {
            $res['temperature_i'] = $this->temperatureI;
        }
        if (null !== $this->temperatureJ) {
            $res['temperature_j'] = $this->temperatureJ;
        }
        if (null !== $this->temperatureK) {
            $res['temperature_k'] = $this->temperatureK;
        }
        if (null !== $this->identityDistributedList) {
            $res['identity_distributed_list'] = [];
            if (null !== $this->identityDistributedList && \is_array($this->identityDistributedList)) {
                $n = 0;
                foreach ($this->identityDistributedList as $item) {
                    $res['identity_distributed_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->extendArgList) {
            $res['extend_arg_list'] = [];
            if (null !== $this->extendArgList && \is_array($this->extendArgList)) {
                $n = 0;
                foreach ($this->extendArgList as $item) {
                    $res['extend_arg_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeviceStatistics
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['serial_no'])) {
            $model->serialNo = $map['serial_no'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }
        if (isset($map['green'])) {
            $model->green = $map['green'];
        }
        if (isset($map['yellow'])) {
            $model->yellow = $map['yellow'];
        }
        if (isset($map['red'])) {
            $model->red = $map['red'];
        }
        if (isset($map['code_err'])) {
            $model->codeErr = $map['code_err'];
        }
        if (isset($map['face'])) {
            $model->face = $map['face'];
        }
        if (isset($map['health_code'])) {
            $model->healthCode = $map['health_code'];
        }
        if (isset($map['cert'])) {
            $model->cert = $map['cert'];
        }
        if (isset($map['other_mode'])) {
            $model->otherMode = $map['other_mode'];
        }
        if (isset($map['pass'])) {
            $model->pass = $map['pass'];
        }
        if (isset($map['stop'])) {
            $model->stop = $map['stop'];
        }
        if (isset($map['avg_time'])) {
            $model->avgTime = $map['avg_time'];
        }
        if (isset($map['vaccine_no'])) {
            $model->vaccineNo = $map['vaccine_no'];
        }
        if (isset($map['vaccine_first'])) {
            $model->vaccineFirst = $map['vaccine_first'];
        }
        if (isset($map['vaccine_second'])) {
            $model->vaccineSecond = $map['vaccine_second'];
        }
        if (isset($map['vaccine_third'])) {
            $model->vaccineThird = $map['vaccine_third'];
        }
        if (isset($map['vaccine_unknown'])) {
            $model->vaccineUnknown = $map['vaccine_unknown'];
        }
        if (isset($map['nucleic_acid24h'])) {
            $model->nucleicAcid24h = $map['nucleic_acid24h'];
        }
        if (isset($map['nucleic_acid48h'])) {
            $model->nucleicAcid48h = $map['nucleic_acid48h'];
        }
        if (isset($map['nucleic_acid72h'])) {
            $model->nucleicAcid72h = $map['nucleic_acid72h'];
        }
        if (isset($map['nucleic_acid7d'])) {
            $model->nucleicAcid7d = $map['nucleic_acid7d'];
        }
        if (isset($map['nucleic_acid_other'])) {
            $model->nucleicAcidOther = $map['nucleic_acid_other'];
        }
        if (isset($map['temperature_a'])) {
            $model->temperatureA = $map['temperature_a'];
        }
        if (isset($map['temperature_b'])) {
            $model->temperatureB = $map['temperature_b'];
        }
        if (isset($map['temperature_c'])) {
            $model->temperatureC = $map['temperature_c'];
        }
        if (isset($map['temperature_d'])) {
            $model->temperatureD = $map['temperature_d'];
        }
        if (isset($map['temperature_e'])) {
            $model->temperatureE = $map['temperature_e'];
        }
        if (isset($map['temperature_f'])) {
            $model->temperatureF = $map['temperature_f'];
        }
        if (isset($map['temperature_g'])) {
            $model->temperatureG = $map['temperature_g'];
        }
        if (isset($map['temperature_h'])) {
            $model->temperatureH = $map['temperature_h'];
        }
        if (isset($map['temperature_i'])) {
            $model->temperatureI = $map['temperature_i'];
        }
        if (isset($map['temperature_j'])) {
            $model->temperatureJ = $map['temperature_j'];
        }
        if (isset($map['temperature_k'])) {
            $model->temperatureK = $map['temperature_k'];
        }
        if (isset($map['identity_distributed_list'])) {
            if (!empty($map['identity_distributed_list'])) {
                $model->identityDistributedList = [];
                $n                              = 0;
                foreach ($map['identity_distributed_list'] as $item) {
                    $model->identityDistributedList[$n++] = null !== $item ? IdentityDistributed::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['extend_arg_list'])) {
            if (!empty($map['extend_arg_list'])) {
                $model->extendArgList = [];
                $n                    = 0;
                foreach ($map['extend_arg_list'] as $item) {
                    $model->extendArgList[$n++] = null !== $item ? StatisticsExtendArg::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
