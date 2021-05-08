<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class CertUseParams extends Model
{
    // 证明文件ID
    /**
     * @example 20201125010000RD831500012865
     *
     * @var string
     */
    public $issueId;
    protected $_name = [
        'issueId' => 'issue_id',
    ];

    public function validate()
    {
        Model::validateRequired('issueId', $this->issueId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->issueId) {
            $res['issue_id'] = $this->issueId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CertUseParams
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['issue_id'])) {
            $model->issueId = $map['issue_id'];
        }

        return $model;
    }
}
