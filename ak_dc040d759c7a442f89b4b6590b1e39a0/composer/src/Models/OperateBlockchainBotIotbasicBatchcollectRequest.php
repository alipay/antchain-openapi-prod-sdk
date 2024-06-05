<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models;

use AlibabaCloud\Tea\Model;

class OperateBlockchainBotIotbasicBatchcollectRequest extends Model
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

    // 所属业务
    /**
     * @var string
     */
    public $bizScene;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 上链数据列表
    /**
     * @var CollectInfo[]
     */
    public $collectInfoList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizScene'          => 'biz_scene',
        'tenantId'          => 'tenant_id',
        'collectInfoList'   => 'collect_info_list',
    ];

    public function validate()
    {
        Model::validateRequired('bizScene', $this->bizScene, true);
        Model::validateRequired('collectInfoList', $this->collectInfoList, true);
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
        if (null !== $this->bizScene) {
            $res['biz_scene'] = $this->bizScene;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->collectInfoList) {
            $res['collect_info_list'] = [];
            if (null !== $this->collectInfoList && \is_array($this->collectInfoList)) {
                $n = 0;
                foreach ($this->collectInfoList as $item) {
                    $res['collect_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateBlockchainBotIotbasicBatchcollectRequest
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
        if (isset($map['biz_scene'])) {
            $model->bizScene = $map['biz_scene'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['collect_info_list'])) {
            if (!empty($map['collect_info_list'])) {
                $model->collectInfoList = [];
                $n                      = 0;
                foreach ($map['collect_info_list'] as $item) {
                    $model->collectInfoList[$n++] = null !== $item ? CollectInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
