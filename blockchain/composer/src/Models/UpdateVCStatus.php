<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class UpdateVCStatus extends Model
{
    // valid or invalid
    /**
     * @example valid
     *
     * @var string
     */
    public $status;

    // 可验证声明id
    /**
     * @example vc:mychain:xxxx
     *
     * @var string
     */
    public $vcId;
    protected $_name = [
        'status' => 'status',
        'vcId'   => 'vc_id',
    ];

    public function validate()
    {
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('vcId', $this->vcId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->vcId) {
            $res['vc_id'] = $this->vcId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateVCStatus
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['vc_id'])) {
            $model->vcId = $map['vc_id'];
        }

        return $model;
    }
}
