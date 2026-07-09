<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class GetXrUserticketRequest extends Model
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

    // 用户通行证编码
    /**
     * @var string
     */
    public $xrTicketCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizScene'          => 'biz_scene',
        'xrTicketCode'      => 'xr_ticket_code',
    ];

    public function validate()
    {
        Model::validateRequired('bizScene', $this->bizScene, true);
        Model::validateRequired('xrTicketCode', $this->xrTicketCode, true);
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
        if (null !== $this->xrTicketCode) {
            $res['xr_ticket_code'] = $this->xrTicketCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetXrUserticketRequest
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
        if (isset($map['xr_ticket_code'])) {
            $model->xrTicketCode = $map['xr_ticket_code'];
        }

        return $model;
    }
}
