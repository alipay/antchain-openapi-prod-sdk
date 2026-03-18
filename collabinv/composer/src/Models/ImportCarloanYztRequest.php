<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COLLABINV\Models;

use AlibabaCloud\Tea\Model;

class ImportCarloanYztRequest extends Model
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

    // 用户id
    /**
     * @var string
     */
    public $userId;

    // 手机号
    /**
     * @var string
     */
    public $phoneNum;

    // 车牌号
    /**
     * @var string
     */
    public $licenseNo;

    // 城市编码
    /**
     * @var string
     */
    public $cityCode;

    // 城市名称
    /**
     * @var string
     */
    public $cityName;

    // yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $reportTime;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'userId'            => 'user_id',
        'phoneNum'          => 'phone_num',
        'licenseNo'         => 'license_no',
        'cityCode'          => 'city_code',
        'cityName'          => 'city_name',
        'reportTime'        => 'report_time',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('phoneNum', $this->phoneNum, true);
        Model::validateRequired('licenseNo', $this->licenseNo, true);
        Model::validateRequired('cityCode', $this->cityCode, true);
        Model::validateRequired('cityName', $this->cityName, true);
        Model::validateRequired('reportTime', $this->reportTime, true);
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
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->phoneNum) {
            $res['phone_num'] = $this->phoneNum;
        }
        if (null !== $this->licenseNo) {
            $res['license_no'] = $this->licenseNo;
        }
        if (null !== $this->cityCode) {
            $res['city_code'] = $this->cityCode;
        }
        if (null !== $this->cityName) {
            $res['city_name'] = $this->cityName;
        }
        if (null !== $this->reportTime) {
            $res['report_time'] = $this->reportTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportCarloanYztRequest
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
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['phone_num'])) {
            $model->phoneNum = $map['phone_num'];
        }
        if (isset($map['license_no'])) {
            $model->licenseNo = $map['license_no'];
        }
        if (isset($map['city_code'])) {
            $model->cityCode = $map['city_code'];
        }
        if (isset($map['city_name'])) {
            $model->cityName = $map['city_name'];
        }
        if (isset($map['report_time'])) {
            $model->reportTime = $map['report_time'];
        }

        return $model;
    }
}
