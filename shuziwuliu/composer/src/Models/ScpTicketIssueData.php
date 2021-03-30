<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ScpTicketIssueData extends Model
{
    // 凭证对应的司机/货主的did
    /**
     * @example 1111
     *
     * @var string
     */
    public $did;

    //
    // 凭证id
    /**
     * @example 11111111
     *
     * @var string
     */
    public $issueId;
    protected $_name = [
        'did'     => 'did',
        'issueId' => 'issue_id',
    ];

    public function validate()
    {
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('issueId', $this->issueId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->issueId) {
            $res['issue_id'] = $this->issueId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ScpTicketIssueData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['issue_id'])) {
            $model->issueId = $map['issue_id'];
        }

        return $model;
    }
}
