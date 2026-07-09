<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class BatchcreateXrXrticketpoolRequest extends Model
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

    // xr通行证批量创建请求列表
    /**
     * @var XrTicketPoolBatchReq[]
     */
    public $xrTicketPoolReqs;

    // 业务类型
    /**
     * @var string
     */
    public $bizScene;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'xrTicketPoolReqs'  => 'xr_ticket_pool_reqs',
        'bizScene'          => 'biz_scene',
    ];

    public function validate()
    {
        Model::validateRequired('xrTicketPoolReqs', $this->xrTicketPoolReqs, true);
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
        if (null !== $this->xrTicketPoolReqs) {
            $res['xr_ticket_pool_reqs'] = [];
            if (null !== $this->xrTicketPoolReqs && \is_array($this->xrTicketPoolReqs)) {
                $n = 0;
                foreach ($this->xrTicketPoolReqs as $item) {
                    $res['xr_ticket_pool_reqs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->bizScene) {
            $res['biz_scene'] = $this->bizScene;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchcreateXrXrticketpoolRequest
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
        if (isset($map['xr_ticket_pool_reqs'])) {
            if (!empty($map['xr_ticket_pool_reqs'])) {
                $model->xrTicketPoolReqs = [];
                $n                       = 0;
                foreach ($map['xr_ticket_pool_reqs'] as $item) {
                    $model->xrTicketPoolReqs[$n++] = null !== $item ? XrTicketPoolBatchReq::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['biz_scene'])) {
            $model->bizScene = $map['biz_scene'];
        }

        return $model;
    }
}
