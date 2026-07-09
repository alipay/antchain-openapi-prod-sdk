<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryElectrocarTriplistRequest extends Model
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

    // tuid
    /**
     * @var string
     */
    public $tuid;

    // MONTH（月）
    // WEEK（周）
    // DAY（日）
    /**
     * @var string
     */
    public $timeDimension;

    // Long	时间戳（每月的第一天00:00， 每周的第一天00:00， 每日的00:00）
    /**
     * @var int
     */
    public $timeValue;

    // 分页
    /**
     * @var int
     */
    public $pageNum;

    // 分页
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
     * @return QueryElectrocarTriplistRequest
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
