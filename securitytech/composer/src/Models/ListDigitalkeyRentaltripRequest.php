<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class ListDigitalkeyRentaltripRequest extends Model
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

    // 设备TUID
    /**
     * @var string
     */
    public $tuid;

    // 时间维度：DAY（日）、WEEK（周）、MONTH（月）
    /**
     * @var string
     */
    public $timeDimension;

    // 时间值（格式根据维度）
    /**
     * @var string
     */
    public $timeValue;

    // 页码
    /**
     * @var int
     */
    public $pageNum;

    // 每页条数
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tuid'              => 'tuid',
        'timeDimension'     => 'time_dimension',
        'timeValue'         => 'time_value',
        'pageNum'           => 'page_num',
        'pageSize'          => 'page_size',
    ];

    public function validate()
    {
        Model::validateRequired('tuid', $this->tuid, true);
        Model::validateRequired('timeDimension', $this->timeDimension, true);
        Model::validateRequired('timeValue', $this->timeValue, true);
        Model::validateRequired('pageNum', $this->pageNum, true);
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
        if (null !== $this->tuid) {
            $res['tuid'] = $this->tuid;
        }
        if (null !== $this->timeDimension) {
            $res['time_dimension'] = $this->timeDimension;
        }
        if (null !== $this->timeValue) {
            $res['time_value'] = $this->timeValue;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListDigitalkeyRentaltripRequest
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
        if (isset($map['tuid'])) {
            $model->tuid = $map['tuid'];
        }
        if (isset($map['time_dimension'])) {
            $model->timeDimension = $map['time_dimension'];
        }
        if (isset($map['time_value'])) {
            $model->timeValue = $map['time_value'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}
