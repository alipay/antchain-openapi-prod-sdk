<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APPEX\Models;

use AlibabaCloud\Tea\Model;

class ChannelDTO extends Model
{
    // 通道名称
    /**
     * @example shop01
     *
     * @var string
     */
    public $channelName;

    // 通道是否公开访问
    /**
     * @example true, false
     *
     * @var bool
     */
    public $publicAcl;

    // 通道创建账户
    /**
     * @example did:mychain:ab361842870481b15603c0a4761a67ccfb3e62e7726c5865f0d14d8309469bfc
     *
     * @var string
     */
    public $userDid;
    protected $_name = [
        'channelName' => 'channel_name',
        'publicAcl'   => 'public_acl',
        'userDid'     => 'user_did',
    ];

    public function validate()
    {
        Model::validateRequired('channelName', $this->channelName, true);
        Model::validateRequired('publicAcl', $this->publicAcl, true);
        Model::validateRequired('userDid', $this->userDid, true);
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
        if (null !== $this->userDid) {
            $res['user_did'] = $this->userDid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChannelDTO
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
        if (isset($map['user_did'])) {
            $model->userDid = $map['user_did'];
        }

        return $model;
    }
}
