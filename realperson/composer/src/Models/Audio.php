<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class Audio extends Model
{
    // 音频文件名称（单次请求保持唯一）
    /**
     * @example 81995a7fa2bfc132eb69cdc2028f0619.wav
     *
     * @var string
     */
    public $token;

    // 待认证的音频文件，base64编码格式
    /**
     * @example /9j/238sn382l23f4
     *
     * @var string
     */
    public $rawData;

    // 音频文件OSS地址
    /**
     * @example https://xxxxxx.oss-cn-shanghai.aliyuncs.com/12345.wav
     *
     * @var string
     */
    public $audioUrl;
    protected $_name = [
        'token'    => 'token',
        'rawData'  => 'raw_data',
        'audioUrl' => 'audio_url',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }
        if (null !== $this->rawData) {
            $res['raw_data'] = $this->rawData;
        }
        if (null !== $this->audioUrl) {
            $res['audio_url'] = $this->audioUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Audio
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['token'])) {
            $model->token = $map['token'];
        }
        if (isset($map['raw_data'])) {
            $model->rawData = $map['raw_data'];
        }
        if (isset($map['audio_url'])) {
            $model->audioUrl = $map['audio_url'];
        }

        return $model;
    }
}
