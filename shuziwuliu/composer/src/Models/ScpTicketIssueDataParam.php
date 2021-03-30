<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ScpTicketIssueDataParam extends Model
{
    // 凭证id
    /**
     * @example 12345566
     *
     * @var string
     */
    public $issueId;

    // 凭证对应的司机/货主的did
    /**
     * @example 11111
     *
     * @var string
     */
    public $did;
    protected $_name = [
        'issueId' => 'issue_id',
        'did'     => 'did',
    ];

    public function validate()
    {
        Model::validateRequired('issueId', $this->issueId, true);
        Model::validateRequired('did', $this->did, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->issueId) {
            $res['issue_id'] = $this->issueId;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ScpTicketIssueDataParam
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['issue_id'])) {
            $model->issueId = $map['issue_id'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }

        return $model;
    }
}
