<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class LogisticFinUser extends Model
{
    // 纳税人识别号
    /**
     * @example 789
     *
     * @var string
     */
    public $draweeTaxNo;

    // 业务方企业id
    /**
     * @example 123
     *
     * @var string
     */
    public $orgId;

    // 业务方用户id
    /**
     * @example 456
     *
     * @var string
     */
    public $userId;
    protected $_name = [
        'draweeTaxNo' => 'drawee_tax_no',
        'orgId'       => 'org_id',
        'userId'      => 'user_id',
    ];

    public function validate()
    {
        Model::validateRequired('draweeTaxNo', $this->draweeTaxNo, true);
        Model::validateRequired('orgId', $this->orgId, true);
        Model::validateRequired('userId', $this->userId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->draweeTaxNo) {
            $res['drawee_tax_no'] = $this->draweeTaxNo;
        }
        if (null !== $this->orgId) {
            $res['org_id'] = $this->orgId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LogisticFinUser
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['drawee_tax_no'])) {
            $model->draweeTaxNo = $map['drawee_tax_no'];
        }
        if (isset($map['org_id'])) {
            $model->orgId = $map['org_id'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }

        return $model;
    }
}
