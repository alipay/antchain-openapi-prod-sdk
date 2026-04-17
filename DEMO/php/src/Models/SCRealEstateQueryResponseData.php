<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class SCRealEstateQueryResponseData extends Model
{
    // area_code
    /**
     * @example 510108
     *
     * @var string
     */
    public $areaCode;

    // area_name
    /**
     * @example area_name
     *
     * @var string
     */
    public $areaName;

    // bdcdyh
    /**
     * @example bdcdyh
     *
     * @var string
     */
    public $bdcdyh;

    // bdcqzh
    /**
     * @example bdcqzh
     *
     * @var string
     */
    public $bdcqzh;

    // djsj
    /**
     * @example djsj
     *
     * @var string
     */
    public $djsj;

    // fwyt1
    /**
     * @example fwyt1
     *
     * @var string
     */
    public $fwyt1;

    // gyqk
    /**
     * @example gyqk
     *
     * @var string
     */
    public $gyqk;

    // qllx
    /**
     * @example qllx
     *
     * @var string
     */
    public $qllx;

    // qlrmc
    /**
     * @example qlrmc
     *
     * @var string
     */
    public $qlrmc;

    // scjzmj
    /**
     * @example scjzmj
     *
     * @var string
     */
    public $scjzmj;
    protected $_name = [
        'areaCode' => 'area_code',
        'areaName' => 'area_name',
        'bdcdyh'   => 'bdcdyh',
        'bdcqzh'   => 'bdcqzh',
        'djsj'     => 'djsj',
        'fwyt1'    => 'fwyt1',
        'gyqk'     => 'gyqk',
        'qllx'     => 'qllx',
        'qlrmc'    => 'qlrmc',
        'scjzmj'   => 'scjzmj',
    ];

    public function validate()
    {
        Model::validateRequired('areaCode', $this->areaCode, true);
        Model::validateRequired('areaName', $this->areaName, true);
        Model::validateRequired('bdcdyh', $this->bdcdyh, true);
        Model::validateRequired('bdcqzh', $this->bdcqzh, true);
        Model::validateRequired('djsj', $this->djsj, true);
        Model::validateRequired('fwyt1', $this->fwyt1, true);
        Model::validateRequired('gyqk', $this->gyqk, true);
        Model::validateRequired('qllx', $this->qllx, true);
        Model::validateRequired('qlrmc', $this->qlrmc, true);
        Model::validateRequired('scjzmj', $this->scjzmj, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->areaCode) {
            $res['area_code'] = $this->areaCode;
        }
        if (null !== $this->areaName) {
            $res['area_name'] = $this->areaName;
        }
        if (null !== $this->bdcdyh) {
            $res['bdcdyh'] = $this->bdcdyh;
        }
        if (null !== $this->bdcqzh) {
            $res['bdcqzh'] = $this->bdcqzh;
        }
        if (null !== $this->djsj) {
            $res['djsj'] = $this->djsj;
        }
        if (null !== $this->fwyt1) {
            $res['fwyt1'] = $this->fwyt1;
        }
        if (null !== $this->gyqk) {
            $res['gyqk'] = $this->gyqk;
        }
        if (null !== $this->qllx) {
            $res['qllx'] = $this->qllx;
        }
        if (null !== $this->qlrmc) {
            $res['qlrmc'] = $this->qlrmc;
        }
        if (null !== $this->scjzmj) {
            $res['scjzmj'] = $this->scjzmj;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SCRealEstateQueryResponseData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['area_code'])) {
            $model->areaCode = $map['area_code'];
        }
        if (isset($map['area_name'])) {
            $model->areaName = $map['area_name'];
        }
        if (isset($map['bdcdyh'])) {
            $model->bdcdyh = $map['bdcdyh'];
        }
        if (isset($map['bdcqzh'])) {
            $model->bdcqzh = $map['bdcqzh'];
        }
        if (isset($map['djsj'])) {
            $model->djsj = $map['djsj'];
        }
        if (isset($map['fwyt1'])) {
            $model->fwyt1 = $map['fwyt1'];
        }
        if (isset($map['gyqk'])) {
            $model->gyqk = $map['gyqk'];
        }
        if (isset($map['qllx'])) {
            $model->qllx = $map['qllx'];
        }
        if (isset($map['qlrmc'])) {
            $model->qlrmc = $map['qlrmc'];
        }
        if (isset($map['scjzmj'])) {
            $model->scjzmj = $map['scjzmj'];
        }

        return $model;
    }
}
