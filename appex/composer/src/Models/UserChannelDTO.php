<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APPEX\Models;

use AlibabaCloud\Tea\Model;

class UserChannelDTO extends Model
{
    // 通道名称
    /**
     * @example shop1
     *
     * @var string
     */
    public $channelName;

    // 通道是否公开可访问
    /**
     * @example true, false
     *
     * @var bool
     */
    public $publicAcl;

    // 创建通道的用户did
    /**
     * @example did:mychain:ab361842870481b15603c0a4761a67ccfb3e62e7726c5865f0d14d8309469bfc
     *
     * @var string
     */
    public $creatorDid;

    // 权限到期时间
    /**
     * @example 2020-12-15 15:26:00
     *
     * @var string
     */
    public $validTime;
    protected $_name = [
        'channelName' => 'channel_name',
        'publicAcl'   => 'public_acl',
        'creatorDid'  => 'creator_did',
        'validTime'   => 'valid_time',
    ];

    public function validate()
    {
        Model::validateRequired('channelName', $this->channelName, true);
        Model::validateRequired('publicAcl', $this->publicAcl, true);
        Model::validateRequired('creatorDid', $this->creatorDid, true);
        Model::validateRequired('validTime', $this->validTime, true);
        Model::validatePattern('validTime', $this->validTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->channelName) {
            $res['channel_name'] = $this->channelName;
        }
        if (null !== $this->publicAcl) {
            $res['public_acl'] = $this->publicAcl;
        }
        if (null !== $this->creatorDid) {
            $res['creator_did'] = $this->creatorDid;
        }
        if (null !== $this->validTime) {
            $res['valid_time'] = $this->validTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UserChannelDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['channel_name'])) {
            $model->channelName = $map['channel_name'];
        }
        if (isset($map['public_acl'])) {
            $model->publicAcl = $map['public_acl'];
        }
        if (isset($map['creator_did'])) {
            $model->creatorDid = $map['creator_did'];
        }
        if (isset($map['valid_time'])) {
            $model->validTime = $map['valid_time'];
        }

        return $model;
    }
}
