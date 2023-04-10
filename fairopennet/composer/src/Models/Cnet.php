<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\FAIROPENNET\Models;

use AlibabaCloud\Tea\Model;

class Cnet extends Model
{
    /**
     * @example
     *
     * @var string
     */
    public $id;

    /**
     * @example
     *
     * @var string
     */
    public $blockchainNum;

    /**
     * @example
     *
     * @var string
     */
    public $myNormalNodeId;

    /**
     * @example
     *
     * @var string
     */
    public $governanceContract;

    /**
     * @example
     *
     * @var string
     */
    public $myRole;

    /**
     * @example
     *
     * @var string[]
     */
    public $partyList;
    protected $_name = [
        'id'                 => 'id',
        'blockchainNum'      => 'blockchain_num',
        'myNormalNodeId'     => 'my_normal_node_id',
        'governanceContract' => 'governance_contract',
        'myRole'             => 'my_role',
        'partyList'          => 'party_list',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('blockchainNum', $this->blockchainNum, true);
        Model::validateRequired('myNormalNodeId', $this->myNormalNodeId, true);
        Model::validateRequired('governanceContract', $this->governanceContract, true);
        Model::validateRequired('myRole', $this->myRole, true);
        Model::validateRequired('partyList', $this->partyList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->blockchainNum) {
            $res['blockchain_num'] = $this->blockchainNum;
        }
        if (null !== $this->myNormalNodeId) {
            $res['my_normal_node_id'] = $this->myNormalNodeId;
        }
        if (null !== $this->governanceContract) {
            $res['governance_contract'] = $this->governanceContract;
        }
        if (null !== $this->myRole) {
            $res['my_role'] = $this->myRole;
        }
        if (null !== $this->partyList) {
            $res['party_list'] = $this->partyList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Cnet
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['blockchain_num'])) {
            $model->blockchainNum = $map['blockchain_num'];
        }
        if (isset($map['my_normal_node_id'])) {
            $model->myNormalNodeId = $map['my_normal_node_id'];
        }
        if (isset($map['governance_contract'])) {
            $model->governanceContract = $map['governance_contract'];
        }
        if (isset($map['my_role'])) {
            $model->myRole = $map['my_role'];
        }
        if (isset($map['party_list'])) {
            if (!empty($map['party_list'])) {
                $model->partyList = $map['party_list'];
            }
        }

        return $model;
    }
}
