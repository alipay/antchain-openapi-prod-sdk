<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class PartyBFirmDto extends Model
{
    // 乙方统一社会信用代码
    /**
     * @example code
     *
     * @var string
     */
    public $partyBBidderCode;

    // 乙方名称
    /**
     * @example name
     *
     * @var string
     */
    public $partyBName;

    // 乙方授权代表Did
    /**
     * @example did
     *
     * @var string
     */
    public $partyBAuditDid;
    protected $_name = [
        'partyBBidderCode' => 'party_b_bidder_code',
        'partyBName'       => 'party_b_name',
        'partyBAuditDid'   => 'party_b_audit_did',
    ];

    public function validate()
    {
        Model::validateRequired('partyBBidderCode', $this->partyBBidderCode, true);
        Model::validateRequired('partyBName', $this->partyBName, true);
        Model::validateRequired('partyBAuditDid', $this->partyBAuditDid, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->partyBBidderCode) {
            $res['party_b_bidder_code'] = $this->partyBBidderCode;
        }
        if (null !== $this->partyBName) {
            $res['party_b_name'] = $this->partyBName;
        }
        if (null !== $this->partyBAuditDid) {
            $res['party_b_audit_did'] = $this->partyBAuditDid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PartyBFirmDto
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['party_b_bidder_code'])) {
            $model->partyBBidderCode = $map['party_b_bidder_code'];
        }
        if (isset($map['party_b_name'])) {
            $model->partyBName = $map['party_b_name'];
        }
        if (isset($map['party_b_audit_did'])) {
            $model->partyBAuditDid = $map['party_b_audit_did'];
        }

        return $model;
    }
}
