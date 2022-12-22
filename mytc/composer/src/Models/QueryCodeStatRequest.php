<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYTC\Models;

use AlibabaCloud\Tea\Model;

class QueryCodeStatRequest extends Model
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

    // 业务类型，客户自定义标签
    //
    /**
     * @var string
     */
    public $bizType;

    // 开始时间
    /**
     * @var int
     */
    public $startTime;

    // 截止时间
    /**
     * @var int
     */
    public $endTime;

    // 支持以下查询维度：
    // REGISTRATION  注册码统计
    // RELATION  关联码信息统计
    // DEPOSIT    存证信息统计
    /**
     * @var string
     */
    public $codeType;

    // 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
    /**
     * @var string[]
     */
    public $bizLabels;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizType'           => 'biz_type',
        'startTime'         => 'start_time',
        'endTime'           => 'end_time',
        'codeType'          => 'code_type',
        'bizLabels'         => 'biz_labels',
    ];

    public function validate()
    {
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateMaxLength('bizType', $this->bizType, 32);
        Model::validateMaxLength('codeType', $this->codeType, 32);
        Model::validateMinLength('bizType', $this->bizType, 1);
        Model::validateMinLength('codeType', $this->codeType, 1);
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
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->codeType) {
            $res['code_type'] = $this->codeType;
        }
        if (null !== $this->bizLabels) {
            $res['biz_labels'] = $this->bizLabels;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCodeStatRequest
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
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['code_type'])) {
            $model->codeType = $map['code_type'];
        }
        if (isset($map['biz_labels'])) {
            if (!empty($map['biz_labels'])) {
                $model->bizLabels = $map['biz_labels'];
            }
        }

        return $model;
    }
}
