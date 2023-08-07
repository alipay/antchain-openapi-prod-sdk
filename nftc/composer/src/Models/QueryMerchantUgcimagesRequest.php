<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTC\Models;

use AlibabaCloud\Tea\Model;

class QueryMerchantUgcimagesRequest extends Model
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

    // ugc资产铸造记录id列表
    /**
     * @var string[]
     */
    public $recordIdList;

    // 场景
    /**
     * @var string
     */
    public $bizScene;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'recordIdList'      => 'record_id_list',
        'bizScene'          => 'biz_scene',
    ];

    public function validate()
    {
        Model::validateRequired('recordIdList', $this->recordIdList, true);
        Model::validateRequired('bizScene', $this->bizScene, true);
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
        if (null !== $this->recordIdList) {
            $res['record_id_list'] = $this->recordIdList;
        }
        if (null !== $this->bizScene) {
            $res['biz_scene'] = $this->bizScene;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryMerchantUgcimagesRequest
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
        if (isset($map['record_id_list'])) {
            if (!empty($map['record_id_list'])) {
                $model->recordIdList = $map['record_id_list'];
            }
        }
        if (isset($map['biz_scene'])) {
            $model->bizScene = $map['biz_scene'];
        }

        return $model;
    }
}
