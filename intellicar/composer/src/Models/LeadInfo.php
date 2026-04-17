<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class LeadInfo extends Model
{
    // 线索信息
    /**
     * @example xxxx
     *
     * @var string
     */
    public $leadId;

    // 状态值
    /**
     * @example xxxx
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'leadId' => 'lead_id',
        'status' => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('leadId', $this->leadId, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->leadId) {
            $res['lead_id'] = $this->leadId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LeadInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['lead_id'])) {
            $model->leadId = $map['lead_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
