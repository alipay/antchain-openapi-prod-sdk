<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class DidBaseQueryReq extends Model
{
    // * "thingId"       原始ID
    // * "certText"      证书文本
    // * "certPublicKey"证书公钥
    // * "didPublicKey" DID公钥
    // * "didExtension"  DID扩展，设备/企业组织/仓库/空间的解析同thingsExtraParams
    // * "didUsername"   DID用户名
    // * "ownerDid"      所有者DID
    // * "userDid"       使用者DID
    // * "thingType"     实体类型，设备/企业组织/仓库/空间等
    // * "thingStatus"   实体状态
    // * "thingModelId" 实体物模型类型
    // * "thingAttribute"实体属性
    // * "thingVersion"  实体版本
    // * "spacesAttached"关联空间列表
    // * "thingsAttached"关联实体列表（例：库位关联设备）
    // * "authLevel"     授权等级
    // * "thingServiceEndpoint" 服务列表
    /**
     * @example ["如下1","如下2"]
     *
     * @var string[]
     */
    public $dataFilter;

    // 是否从链上查询，从链上查询将返回txHash值
    /**
     * @example false
     *
     * @var bool
     */
    public $onChain;

    // 需要查询的实体Did列表，同一次查询的Did须为相同类型
    /**
     * @example ["did:iot:xxxx","did:iot:yyyyy"]
     *
     * @var string[]
     */
    public $thingsDidList;
    protected $_name = [
        'dataFilter'    => 'data_filter',
        'onChain'       => 'on_chain',
        'thingsDidList' => 'things_did_list',
    ];

    public function validate()
    {
        Model::validateRequired('dataFilter', $this->dataFilter, true);
        Model::validateRequired('onChain', $this->onChain, true);
        Model::validateRequired('thingsDidList', $this->thingsDidList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->dataFilter) {
            $res['data_filter'] = $this->dataFilter;
        }
        if (null !== $this->onChain) {
            $res['on_chain'] = $this->onChain;
        }
        if (null !== $this->thingsDidList) {
            $res['things_did_list'] = $this->thingsDidList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DidBaseQueryReq
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['data_filter'])) {
            if (!empty($map['data_filter'])) {
                $model->dataFilter = $map['data_filter'];
            }
        }
        if (isset($map['on_chain'])) {
            $model->onChain = $map['on_chain'];
        }
        if (isset($map['things_did_list'])) {
            if (!empty($map['things_did_list'])) {
                $model->thingsDidList = $map['things_did_list'];
            }
        }

        return $model;
    }
}
