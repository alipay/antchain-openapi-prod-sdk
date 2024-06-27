<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_1470b9714f184f1885db246eb9933e95\Models;

use AlibabaCloud\Tea\Model;

class QueryAntchainZkcollabinvLocationInternalRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // md5加密的身份证号
    /**
     * @var string
     */
    public $idNumber;

    // md5加密的手机号
    /**
     * @var string
     */
    public $phoneNo;

    // 定位时间范围开始时间
    /**
     * @var string
     */
    public $startTime;

    // 定位时间范围结束时间
    /**
     * @var string
     */
    public $endTime;

    // 核查中心位置（经度,纬度）
    /**
     * @var string
     */
    public $centerPosition;

    // 核查省市区县范围
    /**
     * @var string
     */
    public $distinctCounty;

    // 协查类型：
    // 0: 为经纬度精准定位协查 (默认)
    // 1:  为区县定位 (省-市-区/县) 协查
    /**
     * @var int
     */
    public $invType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'idNumber'          => 'id_number',
        'phoneNo'           => 'phone_no',
        'startTime'         => 'start_time',
        'endTime'           => 'end_time',
        'centerPosition'    => 'center_position',
        'distinctCounty'    => 'distinct_county',
        'invType'           => 'inv_type',
    ];

    public function validate()
    {
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('endTime', $this->endTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->idNumber) {
            $res['id_number'] = $this->idNumber;
        }
        if (null !== $this->phoneNo) {
            $res['phone_no'] = $this->phoneNo;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->centerPosition) {
            $res['center_position'] = $this->centerPosition;
        }
        if (null !== $this->distinctCounty) {
            $res['distinct_county'] = $this->distinctCounty;
        }
        if (null !== $this->invType) {
            $res['inv_type'] = $this->invType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAntchainZkcollabinvLocationInternalRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['id_number'])) {
            $model->idNumber = $map['id_number'];
        }
        if (isset($map['phone_no'])) {
            $model->phoneNo = $map['phone_no'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['center_position'])) {
            $model->centerPosition = $map['center_position'];
        }
        if (isset($map['distinct_county'])) {
            $model->distinctCounty = $map['distinct_county'];
        }
        if (isset($map['inv_type'])) {
            $model->invType = $map['inv_type'];
        }

        return $model;
    }
}
