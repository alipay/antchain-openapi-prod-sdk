<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CreateXrUserticketRequest extends Model
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

    // 用户id
    /**
     * @var string
     */
    public $userId;

    // 购买的通行证列表详情
    /**
     * @var XrUserTicketInfo[]
     */
    public $xrUserTicketList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizScene'          => 'biz_scene',
        'userId'            => 'user_id',
        'xrUserTicketList'  => 'xr_user_ticket_list',
    ];

    public function validate()
    {
        Model::validateRequired('bizScene', $this->bizScene, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('xrUserTicketList', $this->xrUserTicketList, true);
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
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->xrUserTicketList) {
            $res['xr_user_ticket_list'] = [];
            if (null !== $this->xrUserTicketList && \is_array($this->xrUserTicketList)) {
                $n = 0;
                foreach ($this->xrUserTicketList as $item) {
                    $res['xr_user_ticket_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateXrUserticketRequest
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
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['xr_user_ticket_list'])) {
            if (!empty($map['xr_user_ticket_list'])) {
                $model->xrUserTicketList = [];
                $n                       = 0;
                foreach ($map['xr_user_ticket_list'] as $item) {
                    $model->xrUserTicketList[$n++] = null !== $item ? XrUserTicketInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
