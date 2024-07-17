<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_a050edd0f07344eabd879166e7187ce5\Models;

use AlibabaCloud\Tea\Model;

class Output extends Model
{
    // 交互类型多媒体节点使用
    //
    /**
     * @example VOICE
     *
     * @var string
     */
    public $interactionType;

    // 播报内容类型
    /**
     * @example RECORD
     *
     * @var string
     */
    public $contentKey;

    // 合成的播报内容或者是录音的文件地址
    /**
     * @example ss
     *
     * @var string
     */
    public $content;

    // 视频文件id
    /**
     * @example 1234
     *
     * @var string
     */
    public $videoFileId;

    // 视频文件播放长度毫秒
    /**
     * @example
     *
     * @var int
     */
    public $videoFileContentTime;

    // 扩展信息
    /**
     * @example ss
     *
     * @var string
     */
    public $extInfo;

    // key为上面content中的变量value为名称
    /**
     * @example ss
     *
     * @var string
     */
    public $variableMap;

    // 视频文件code
    /**
     * @example sadfq2342134
     *
     * @var string
     */
    public $videoCode;

    // 语音文件code
    /**
     * @example dsafqwer2134214
     *
     * @var string
     */
    public $voiceCode;

    // 输出内容list
    /**
     * @example
     *
     * @var string[]
     */
    public $contentList;
    protected $_name = [
        'interactionType'      => 'interaction_type',
        'contentKey'           => 'content_key',
        'content'              => 'content',
        'videoFileId'          => 'video_file_id',
        'videoFileContentTime' => 'video_file_content_time',
        'extInfo'              => 'ext_info',
        'variableMap'          => 'variable_map',
        'videoCode'            => 'video_code',
        'voiceCode'            => 'voice_code',
        'contentList'          => 'content_list',
    ];

    public function validate()
    {
        Model::validateRequired('interactionType', $this->interactionType, true);
        Model::validateRequired('contentKey', $this->contentKey, true);
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('videoFileId', $this->videoFileId, true);
        Model::validateRequired('videoFileContentTime', $this->videoFileContentTime, true);
        Model::validateRequired('extInfo', $this->extInfo, true);
        Model::validateRequired('variableMap', $this->variableMap, true);
        Model::validateRequired('videoCode', $this->videoCode, true);
        Model::validateRequired('voiceCode', $this->voiceCode, true);
        Model::validateRequired('contentList', $this->contentList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->interactionType) {
            $res['interaction_type'] = $this->interactionType;
        }
        if (null !== $this->contentKey) {
            $res['content_key'] = $this->contentKey;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->videoFileId) {
            $res['video_file_id'] = $this->videoFileId;
        }
        if (null !== $this->videoFileContentTime) {
            $res['video_file_content_time'] = $this->videoFileContentTime;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        if (null !== $this->variableMap) {
            $res['variable_map'] = $this->variableMap;
        }
        if (null !== $this->videoCode) {
            $res['video_code'] = $this->videoCode;
        }
        if (null !== $this->voiceCode) {
            $res['voice_code'] = $this->voiceCode;
        }
        if (null !== $this->contentList) {
            $res['content_list'] = $this->contentList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Output
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['interaction_type'])) {
            $model->interactionType = $map['interaction_type'];
        }
        if (isset($map['content_key'])) {
            $model->contentKey = $map['content_key'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['video_file_id'])) {
            $model->videoFileId = $map['video_file_id'];
        }
        if (isset($map['video_file_content_time'])) {
            $model->videoFileContentTime = $map['video_file_content_time'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }
        if (isset($map['variable_map'])) {
            $model->variableMap = $map['variable_map'];
        }
        if (isset($map['video_code'])) {
            $model->videoCode = $map['video_code'];
        }
        if (isset($map['voice_code'])) {
            $model->voiceCode = $map['voice_code'];
        }
        if (isset($map['content_list'])) {
            if (!empty($map['content_list'])) {
                $model->contentList = $map['content_list'];
            }
        }

        return $model;
    }
}
