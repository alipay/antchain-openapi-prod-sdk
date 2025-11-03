<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class UpdateMeiyouItagrelationRequest extends Model
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

    // 更新关系信息
    /**
     * @var UpdateMeiyouItagRelationWebInfo[]
     */
    public $relationInfoList;

    // 是否更新审核记录信息
    /**
     * @var bool
     */
    public $updateAuditFlag;

    // 数据来源
    /**
     * @var string
     */
    public $source;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'relationInfoList'  => 'relation_info_list',
        'updateAuditFlag'   => 'update_audit_flag',
        'source'            => 'source',
    ];

    public function validate()
    {
        Model::validateRequired('updateAuditFlag', $this->updateAuditFlag, true);
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
        if (null !== $this->relationInfoList) {
            $res['relation_info_list'] = [];
            if (null !== $this->relationInfoList && \is_array($this->relationInfoList)) {
                $n = 0;
                foreach ($this->relationInfoList as $item) {
                    $res['relation_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->updateAuditFlag) {
            $res['update_audit_flag'] = $this->updateAuditFlag;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateMeiyouItagrelationRequest
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
        if (isset($map['relation_info_list'])) {
            if (!empty($map['relation_info_list'])) {
                $model->relationInfoList = [];
                $n                       = 0;
                foreach ($map['relation_info_list'] as $item) {
                    $model->relationInfoList[$n++] = null !== $item ? UpdateMeiyouItagRelationWebInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['update_audit_flag'])) {
            $model->updateAuditFlag = $map['update_audit_flag'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }

        return $model;
    }
}
