<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IPShopInfo extends Model
{
    // 授权申请的内部编码
    /**
     * @example 381055Afc982
     *
     * @var string
     */
    public $itemCode;

    // 淘宝卖家的官方昵称
    /**
     * @example 卖家昵称1
     *
     * @var string
     */
    public $sellerNick;

    // 授权渠道名称
    /**
     * @example 淘宝网
     *
     * @var string
     */
    public $channelName;

    // 数据授权方式
    /**
     * @example 淘宝开放平台
     *
     * @var string
     */
    public $authType;

    // 授权启始时间戳(unix毫秒)
    /**
     * @example 100100198
     *
     * @var int
     */
    public $authStart;

    // 授权终止时间戳(unix毫秒)
    /**
     * @example 100100198816
     *
     * @var int
     */
    public $authEnd;

    // 授权状态(1: Init, 2: Success, 3: Expired)
    /**
     * @example 1
     *
     * @var int
     */
    public $authStatus;

    // 授权链接
    /**
     * @example https://oauth.taobao.com/authorize?response_type=code&client_id=%s&redirect_uri=%s&state=%s&view=web
     *
     * @var string
     */
    public $authUrl;
    protected $_name = [
        'itemCode'    => 'item_code',
        'sellerNick'  => 'seller_nick',
        'channelName' => 'channel_name',
        'authType'    => 'auth_type',
        'authStart'   => 'auth_start',
        'authEnd'     => 'auth_end',
        'authStatus'  => 'auth_status',
        'authUrl'     => 'auth_url',
    ];

    public function validate()
    {
        Model::validateRequired('itemCode', $this->itemCode, true);
        Model::validateRequired('sellerNick', $this->sellerNick, true);
        Model::validateRequired('channelName', $this->channelName, true);
        Model::validateRequired('authType', $this->authType, true);
        Model::validateRequired('authStart', $this->authStart, true);
        Model::validateRequired('authEnd', $this->authEnd, true);
        Model::validateRequired('authStatus', $this->authStatus, true);
        Model::validateRequired('authUrl', $this->authUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->itemCode) {
            $res['item_code'] = $this->itemCode;
        }
        if (null !== $this->sellerNick) {
            $res['seller_nick'] = $this->sellerNick;
        }
        if (null !== $this->channelName) {
            $res['channel_name'] = $this->channelName;
        }
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }
        if (null !== $this->authStart) {
            $res['auth_start'] = $this->authStart;
        }
        if (null !== $this->authEnd) {
            $res['auth_end'] = $this->authEnd;
        }
        if (null !== $this->authStatus) {
            $res['auth_status'] = $this->authStatus;
        }
        if (null !== $this->authUrl) {
            $res['auth_url'] = $this->authUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IPShopInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['item_code'])) {
            $model->itemCode = $map['item_code'];
        }
        if (isset($map['seller_nick'])) {
            $model->sellerNick = $map['seller_nick'];
        }
        if (isset($map['channel_name'])) {
            $model->channelName = $map['channel_name'];
        }
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }
        if (isset($map['auth_start'])) {
            $model->authStart = $map['auth_start'];
        }
        if (isset($map['auth_end'])) {
            $model->authEnd = $map['auth_end'];
        }
        if (isset($map['auth_status'])) {
            $model->authStatus = $map['auth_status'];
        }
        if (isset($map['auth_url'])) {
            $model->authUrl = $map['auth_url'];
        }

        return $model;
    }
}
