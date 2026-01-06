<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class QueryMeiyouAuditRequest extends Model
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

    // 审核记录ID
    /**
     * @var int[]
     */
    public $auditIds;

    // 美柚itag关联状态
    /**
     * @var string
     */
    public $auditState;

    // 开始时间
    /**
     * @var string
     */
    public $gmtCreateStart;

    // 结束时间
    /**
     * @var string
     */
    public $gmtCreateEnd;

    // 最大条数
    /**
     * @var int
     */
    public $maxNum;

    // 数据来源
    /**
     * @var string
     */
    public $source;

    // 操作人
    /**
     * @var string[]
     */
    public $auditOperators;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'auditIds'          => 'audit_ids',
        'auditState'        => 'audit_state',
        'gmtCreateStart'    => 'gmt_create_start',
        'gmtCreateEnd'      => 'gmt_create_end',
        'maxNum'            => 'max_num',
        'source'            => 'source',
        'auditOperators'    => 'audit_operators',
    ];

    public function validate()
    {
        Model::validateRequired('auditState', $this->auditState, true);
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
        if (null !== $this->auditIds) {
            $res['audit_ids'] = $this->auditIds;
        }
        if (null !== $this->auditState) {
            $res['audit_state'] = $this->auditState;
        }
        if (null !== $this->gmtCreateStart) {
            $res['gmt_create_start'] = $this->gmtCreateStart;
        }
        if (null !== $this->gmtCreateEnd) {
            $res['gmt_create_end'] = $this->gmtCreateEnd;
        }
        if (null !== $this->maxNum) {
            $res['max_num'] = $this->maxNum;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->auditOperators) {
            $res['audit_operators'] = $this->auditOperators;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryMeiyouAuditRequest
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
        if (isset($map['audit_ids'])) {
            if (!empty($map['audit_ids'])) {
                $model->auditIds = $map['audit_ids'];
            }
        }
        if (isset($map['audit_state'])) {
            $model->auditState = $map['audit_state'];
        }
        if (isset($map['gmt_create_start'])) {
            $model->gmtCreateStart = $map['gmt_create_start'];
        }
        if (isset($map['gmt_create_end'])) {
            $model->gmtCreateEnd = $map['gmt_create_end'];
        }
        if (isset($map['max_num'])) {
            $model->maxNum = $map['max_num'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['audit_operators'])) {
            if (!empty($map['audit_operators'])) {
                $model->auditOperators = $map['audit_operators'];
            }
        }

        return $model;
    }
}
