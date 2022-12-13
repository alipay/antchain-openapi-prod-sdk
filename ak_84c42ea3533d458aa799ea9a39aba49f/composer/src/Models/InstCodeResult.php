<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_84c42ea3533d458aa799ea9a39aba49f\Models;

use AlibabaCloud\Tea\Model;

class InstCodeResult extends Model
{
    // 机构编码
    //
    /**
     * @example CCB
     *
     * @var string
     */
    public $channelMemberCode;

    // 机构网点联行号
    //
    /**
     * @example 310581000017
     *
     * @var string
     */
    public $channelOfficialNumber;

    // 业务错误码(为空表示成功，否则为业务错误码)
    /**
     * @example PARAM_MISSING
     *
     * @var string
     */
    public $subCode;

    // 业务错误描述
    /**
     * @example 参数不全
     *
     * @var string
     */
    public $subMsg;
    protected $_name = [
        'channelMemberCode'     => 'channel_member_code',
        'channelOfficialNumber' => 'channel_official_number',
        'subCode'               => 'sub_code',
        'subMsg'                => 'sub_msg',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->channelMemberCode) {
            $res['channel_member_code'] = $this->channelMemberCode;
        }
        if (null !== $this->channelOfficialNumber) {
            $res['channel_official_number'] = $this->channelOfficialNumber;
        }
        if (null !== $this->subCode) {
            $res['sub_code'] = $this->subCode;
        }
        if (null !== $this->subMsg) {
            $res['sub_msg'] = $this->subMsg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InstCodeResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['channel_member_code'])) {
            $model->channelMemberCode = $map['channel_member_code'];
        }
        if (isset($map['channel_official_number'])) {
            $model->channelOfficialNumber = $map['channel_official_number'];
        }
        if (isset($map['sub_code'])) {
            $model->subCode = $map['sub_code'];
        }
        if (isset($map['sub_msg'])) {
            $model->subMsg = $map['sub_msg'];
        }

        return $model;
    }
}
