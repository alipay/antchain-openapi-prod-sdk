<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class InsureCarrierObjectInfo extends Model
{
    // 厂牌型号
    /**
     * @example xxxx
     *
     * @var string
     */
    public $cpModel;

    // 车架号
    /**
     * @example xxx
     *
     * @var string
     */
    public $frameNo;

    // 车牌号码
    /**
     * @example 京A23211
     *
     * @var string
     */
    public $licenseNo;

    // 吨位
    /**
     * @example 10
     *
     * @var string
     */
    public $tonNage;

    // 行驶证车主
    /**
     * @example 张三
     *
     * @var string
     */
    public $drivPer;

    // 运营证号
    /**
     * @example xxxx
     *
     * @var string
     */
    public $runNo;

    // 运输货物
    /**
     * @example 运输货物
     *
     * @var string
     */
    public $tsCarGo;
    protected $_name = [
        'cpModel'   => 'cp_model',
        'frameNo'   => 'frame_no',
        'licenseNo' => 'license_no',
        'tonNage'   => 'ton_nage',
        'drivPer'   => 'driv_per',
        'runNo'     => 'run_no',
        'tsCarGo'   => 'ts_car_go',
    ];

    public function validate()
    {
        Model::validateRequired('cpModel', $this->cpModel, true);
        Model::validateRequired('frameNo', $this->frameNo, true);
        Model::validateRequired('licenseNo', $this->licenseNo, true);
        Model::validateRequired('tonNage', $this->tonNage, true);
        Model::validateRequired('drivPer', $this->drivPer, true);
        Model::validateRequired('runNo', $this->runNo, true);
        Model::validateRequired('tsCarGo', $this->tsCarGo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cpModel) {
            $res['cp_model'] = $this->cpModel;
        }
        if (null !== $this->frameNo) {
            $res['frame_no'] = $this->frameNo;
        }
        if (null !== $this->licenseNo) {
            $res['license_no'] = $this->licenseNo;
        }
        if (null !== $this->tonNage) {
            $res['ton_nage'] = $this->tonNage;
        }
        if (null !== $this->drivPer) {
            $res['driv_per'] = $this->drivPer;
        }
        if (null !== $this->runNo) {
            $res['run_no'] = $this->runNo;
        }
        if (null !== $this->tsCarGo) {
            $res['ts_car_go'] = $this->tsCarGo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InsureCarrierObjectInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cp_model'])) {
            $model->cpModel = $map['cp_model'];
        }
        if (isset($map['frame_no'])) {
            $model->frameNo = $map['frame_no'];
        }
        if (isset($map['license_no'])) {
            $model->licenseNo = $map['license_no'];
        }
        if (isset($map['ton_nage'])) {
            $model->tonNage = $map['ton_nage'];
        }
        if (isset($map['driv_per'])) {
            $model->drivPer = $map['driv_per'];
        }
        if (isset($map['run_no'])) {
            $model->runNo = $map['run_no'];
        }
        if (isset($map['ts_car_go'])) {
            $model->tsCarGo = $map['ts_car_go'];
        }

        return $model;
    }
}
