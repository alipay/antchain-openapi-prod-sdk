<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class WitnessApprovalData extends Model
{
    // 审批流程id
    /**
     * @example someId
     *
     * @var string
     */
    public $approvalFlowId;

    // 印章id列表
    /**
     * @example
     *
     * @var string[]
     */
    public $sealIds;
    protected $_name = [
        'approvalFlowId' => 'approval_flow_id',
        'sealIds'        => 'seal_ids',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->approvalFlowId) {
            $res['approval_flow_id'] = $this->approvalFlowId;
        }
        if (null !== $this->sealIds) {
            $res['seal_ids'] = $this->sealIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WitnessApprovalData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['approval_flow_id'])) {
            $model->approvalFlowId = $map['approval_flow_id'];
        }
        if (isset($map['seal_ids'])) {
            if (!empty($map['seal_ids'])) {
                $model->sealIds = $map['seal_ids'];
            }
        }

        return $model;
    }
}
