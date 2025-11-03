<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class QueryMeiyouAgentauditRequest extends Model
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

    // 数据创建时间-开始时间点
    /**
     * @var string
     */
    public $gmtCreateStart;

    // 数据创建时间-结束时间点
    /**
     * @var string
     */
    public $gmtCreateEnd;

    // 所属
    /**
     * @var string
     */
    public $owner;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'gmtCreateStart'    => 'gmt_create_start',
        'gmtCreateEnd'      => 'gmt_create_end',
        'owner'             => 'owner',
    ];

    public function validate()
    {
        Model::validateRequired('gmtCreateStart', $this->gmtCreateStart, true);
        Model::validateRequired('gmtCreateEnd', $this->gmtCreateEnd, true);
        Model::validatePattern('gmtCreateStart', $this->gmtCreateStart, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtCreateEnd', $this->gmtCreateEnd, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->gmtCreateStart) {
            $res['gmt_create_start'] = $this->gmtCreateStart;
        }
        if (null !== $this->gmtCreateEnd) {
            $res['gmt_create_end'] = $this->gmtCreateEnd;
        }
        if (null !== $this->owner) {
            $res['owner'] = $this->owner;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryMeiyouAgentauditRequest
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
        if (isset($map['gmt_create_start'])) {
            $model->gmtCreateStart = $map['gmt_create_start'];
        }
        if (isset($map['gmt_create_end'])) {
            $model->gmtCreateEnd = $map['gmt_create_end'];
        }
        if (isset($map['owner'])) {
            $model->owner = $map['owner'];
        }

        return $model;
    }
}
