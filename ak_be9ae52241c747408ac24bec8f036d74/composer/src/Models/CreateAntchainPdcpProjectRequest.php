<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_be9ae52241c747408ac24bec8f036d74\Models;

use AlibabaCloud\Tea\Model;

class CreateAntchainPdcpProjectRequest extends Model
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

    // 项目名称
    /**
     * @var string
     */
    public $name;

    // 参与方节点信息列表，不同的节点类型参考不同结构体。一期节点类型仅支持FATE，其构造方式请参考FatePartyLocalConfigInfo
    /**
     * @var PartyReq[]
     */
    public $partyList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'name'              => 'name',
        'partyList'         => 'party_list',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('partyList', $this->partyList, true);
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->partyList) {
            $res['party_list'] = [];
            if (null !== $this->partyList && \is_array($this->partyList)) {
                $n = 0;
                foreach ($this->partyList as $item) {
                    $res['party_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAntchainPdcpProjectRequest
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['party_list'])) {
            if (!empty($map['party_list'])) {
                $model->partyList = [];
                $n                = 0;
                foreach ($map['party_list'] as $item) {
                    $model->partyList[$n++] = null !== $item ? PartyReq::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
