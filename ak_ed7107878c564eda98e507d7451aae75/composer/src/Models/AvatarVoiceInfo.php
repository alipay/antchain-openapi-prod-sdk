<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models;

use AlibabaCloud\Tea\Model;

class AvatarVoiceInfo extends Model
{
    // 音色id
    /**
     * @example 1
     *
     * @var string
     */
    public $voiceId;

    // 音色编码
    /**
     * @example 269
     *
     * @var string
     */
    public $voiceCode;

    // 音色名
    /**
     * @example 小忆
     *
     * @var string
     */
    public $voiceName;

    // 预览图
    /**
     * @example www.123.com
     *
     * @var string
     */
    public $image;

    // 音色性别
    /**
     * @example male
     *
     * @var string
     */
    public $gender;

    // 音色类型
    /**
     * @example 克隆音色
     *
     * @var string
     */
    public $voiceType;

    // 音色试听链接列表
    /**
     * @example
     *
     * @var string[]
     */
    public $auditionList;
    protected $_name = [
        'voiceId'      => 'voice_id',
        'voiceCode'    => 'voice_code',
        'voiceName'    => 'voice_name',
        'image'        => 'image',
        'gender'       => 'gender',
        'voiceType'    => 'voice_type',
        'auditionList' => 'audition_list',
    ];

    public function validate()
    {
        Model::validateRequired('voiceId', $this->voiceId, true);
        Model::validateRequired('voiceCode', $this->voiceCode, true);
        Model::validateRequired('voiceName', $this->voiceName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->voiceId) {
            $res['voice_id'] = $this->voiceId;
        }
        if (null !== $this->voiceCode) {
            $res['voice_code'] = $this->voiceCode;
        }
        if (null !== $this->voiceName) {
            $res['voice_name'] = $this->voiceName;
        }
        if (null !== $this->image) {
            $res['image'] = $this->image;
        }
        if (null !== $this->gender) {
            $res['gender'] = $this->gender;
        }
        if (null !== $this->voiceType) {
            $res['voice_type'] = $this->voiceType;
        }
        if (null !== $this->auditionList) {
            $res['audition_list'] = $this->auditionList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AvatarVoiceInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['voice_id'])) {
            $model->voiceId = $map['voice_id'];
        }
        if (isset($map['voice_code'])) {
            $model->voiceCode = $map['voice_code'];
        }
        if (isset($map['voice_name'])) {
            $model->voiceName = $map['voice_name'];
        }
        if (isset($map['image'])) {
            $model->image = $map['image'];
        }
        if (isset($map['gender'])) {
            $model->gender = $map['gender'];
        }
        if (isset($map['voice_type'])) {
            $model->voiceType = $map['voice_type'];
        }
        if (isset($map['audition_list'])) {
            if (!empty($map['audition_list'])) {
                $model->auditionList = $map['audition_list'];
            }
        }

        return $model;
    }
}
