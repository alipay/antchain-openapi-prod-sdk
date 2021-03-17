<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class OtherRightInfo extends Model
{
    // 权证类型，可选值：PROP_RIGHT_CERT("房地产权证")、HOUSE_PROP_RIGHT_CERT("房屋所有权证")、HOUSE_OWNERSHIP_CERT("房屋所有权证")、 OTHER_RIGHT_CERT("房屋他项权证")、REALTY_OWNERSHIP_CERT("不动产权证")、 MORTGAGE_REG_CERT("不动产登记证明(抵押权登记)")
    /**
     * @example PROP_RIGHT_CERT
     *
     * @var string
     */
    public $realtyCertType;

    // 权证号码
    /**
     * @example 1111
     *
     * @var string
     */
    public $realtyCertNo;

    // 权利人
    /**
     * @example
     *
     * @var EntityBasicInfo
     */
    public $obligee;

    // 原他项权证号
    /**
     * @example 11212
     *
     * @var string
     */
    public $oldOtherRealtyCertNo;

    // 坐落
    /**
     * @example 浙江省杭州市
     *
     * @var string
     */
    public $location;

    // 新他项权证类型，可选值：PROP_RIGHT_CERT("房地产权证")、HOUSE_PROP_RIGHT_CERT("房屋所有权证")、HOUSE_OWNERSHIP_CERT("房屋所有权证")、 OTHER_RIGHT_CERT("房屋他项权证")、REALTY_OWNERSHIP_CERT("不动产权证")、 MORTGAGE_REG_CERT("不动产登记证明(抵押权登记)")
    /**
     * @example PROP_RIGHT_CERT
     *
     * @var string
     */
    public $newOtherRightCertType;

    // 新他项权证号
    /**
     * @example 11111
     *
     * @var string
     */
    public $newOtherRightCertNo;

    // 新他项权证电子证照地址，他项权证电子证照上传到房产链的路径
    /**
     * @example rtc/dd.pdf
     *
     * @var string
     */
    public $newOtherRightCertPath;
    protected $_name = [
        'realtyCertType'        => 'realty_cert_type',
        'realtyCertNo'          => 'realty_cert_no',
        'obligee'               => 'obligee',
        'oldOtherRealtyCertNo'  => 'old_other_realty_cert_no',
        'location'              => 'location',
        'newOtherRightCertType' => 'new_other_right_cert_type',
        'newOtherRightCertNo'   => 'new_other_right_cert_no',
        'newOtherRightCertPath' => 'new_other_right_cert_path',
    ];

    public function validate()
    {
        Model::validateRequired('realtyCertType', $this->realtyCertType, true);
        Model::validateRequired('realtyCertNo', $this->realtyCertNo, true);
        Model::validateRequired('obligee', $this->obligee, true);
        Model::validateRequired('location', $this->location, true);
        Model::validateRequired('newOtherRightCertType', $this->newOtherRightCertType, true);
        Model::validateRequired('newOtherRightCertNo', $this->newOtherRightCertNo, true);
        Model::validateRequired('newOtherRightCertPath', $this->newOtherRightCertPath, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->realtyCertType) {
            $res['realty_cert_type'] = $this->realtyCertType;
        }
        if (null !== $this->realtyCertNo) {
            $res['realty_cert_no'] = $this->realtyCertNo;
        }
        if (null !== $this->obligee) {
            $res['obligee'] = null !== $this->obligee ? $this->obligee->toMap() : null;
        }
        if (null !== $this->oldOtherRealtyCertNo) {
            $res['old_other_realty_cert_no'] = $this->oldOtherRealtyCertNo;
        }
        if (null !== $this->location) {
            $res['location'] = $this->location;
        }
        if (null !== $this->newOtherRightCertType) {
            $res['new_other_right_cert_type'] = $this->newOtherRightCertType;
        }
        if (null !== $this->newOtherRightCertNo) {
            $res['new_other_right_cert_no'] = $this->newOtherRightCertNo;
        }
        if (null !== $this->newOtherRightCertPath) {
            $res['new_other_right_cert_path'] = $this->newOtherRightCertPath;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OtherRightInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['realty_cert_type'])) {
            $model->realtyCertType = $map['realty_cert_type'];
        }
        if (isset($map['realty_cert_no'])) {
            $model->realtyCertNo = $map['realty_cert_no'];
        }
        if (isset($map['obligee'])) {
            $model->obligee = EntityBasicInfo::fromMap($map['obligee']);
        }
        if (isset($map['old_other_realty_cert_no'])) {
            $model->oldOtherRealtyCertNo = $map['old_other_realty_cert_no'];
        }
        if (isset($map['location'])) {
            $model->location = $map['location'];
        }
        if (isset($map['new_other_right_cert_type'])) {
            $model->newOtherRightCertType = $map['new_other_right_cert_type'];
        }
        if (isset($map['new_other_right_cert_no'])) {
            $model->newOtherRightCertNo = $map['new_other_right_cert_no'];
        }
        if (isset($map['new_other_right_cert_path'])) {
            $model->newOtherRightCertPath = $map['new_other_right_cert_path'];
        }

        return $model;
    }
}
