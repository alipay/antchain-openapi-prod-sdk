<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class QueryTwevCartravelRequest extends Model
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

    // 登录态token
    /**
     * @var string
     */
    public $token;

    // 车辆中控id
    /**
     * @var string
     */
    public $tuid;

    // 统计时间维度 MONTH（月）/WEEK（周）/DAY（日）
    /**
     * @var string
     */
    public $timeDimension;

    // 时间戳（时间戳所在月/周/日内的数据，每月的第一天00:00， 每周的第一天00:00， 每日的00:00）
    /**
     * @var int
     */
    public $timeValue;

    // 页数
    /**
     * @var int
     */
    public $pageNo;

    // 每页条数
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'token'             => 'token',
        'tuid'              => 'tuid',
        'timeDimension'     => 'time_dimension',
        'timeValue'         => 'time_value',
        'pageNo'            => 'page_no',
        'pageSize'          => 'page_size',
    ];

    public function validate()
    {
        Model::validateRequired('token', $this->token, true);
        Model::validateRequired('tuid', $this->tuid, true);
        Model::validateRequired('timeDimension', $this->timeDimension, true);
        Model::validateRequired('timeValue', $this->timeValue, true);
        Model::validateRequired('pageNo', $this->pageNo, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
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
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }
        if (null !== $this->tuid) {
            $res['tuid'] = $this->tuid;
        }
        if (null !== $this->timeDimension) {
            $res['time_dimension'] = $this->timeDimension;
        }
        if (null !== $this->timeValue) {
            $res['time_value'] = $this->timeValue;
        }
        if (null !== $this->pageNo) {
            $res['page_no'] = $this->pageNo;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTwevCartravelRequest
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
        if (isset($map['token'])) {
            $model->token = $map['token'];
        }
        if (isset($map['tuid'])) {
            $model->tuid = $map['tuid'];
        }
        if (isset($map['time_dimension'])) {
            $model->timeDimension = $map['time_dimension'];
        }
        if (isset($map['time_value'])) {
            $model->timeValue = $map['time_value'];
        }
        if (isset($map['page_no'])) {
            $model->pageNo = $map['page_no'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}
