<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryElectrocarTriplastRequest extends Model
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

    // 时间戳
    /**
     * @var int
     */
    public $timeValue;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tuid'              => 'tuid',
        'timeDimension'     => 'time_dimension',
        'timeValue'         => 'time_value',
    ];

    public function validate()
    {
        Model::validateRequired('tuid', $this->tuid, true);
        Model::validateRequired('timeDimension', $this->timeDimension, true);
        Model::validateRequired('timeValue', $this->timeValue, true);
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryElectrocarTriplastRequest
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

        return $model;
    }
}
