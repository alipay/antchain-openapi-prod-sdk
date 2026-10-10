<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class LyricsBlockchainBotIotagentMusicResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'lyric' => 'lyric',
        'transLyric' => 'trans_lyric',
        'txtLyric' => 'txt_lyric',
        'noLyric' => 'no_lyric',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->lyric) {
            $res['lyric'] = $this->lyric;
        }
        if (null !== $this->transLyric) {
            $res['trans_lyric'] = $this->transLyric;
        }
        if (null !== $this->txtLyric) {
            $res['txt_lyric'] = $this->txtLyric;
        }
        if (null !== $this->noLyric) {
            $res['no_lyric'] = $this->noLyric;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return LyricsBlockchainBotIotagentMusicResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['lyric'])){
            $model->lyric = $map['lyric'];
        }
        if(isset($map['trans_lyric'])){
            $model->transLyric = $map['trans_lyric'];
        }
        if(isset($map['txt_lyric'])){
            $model->txtLyric = $map['txt_lyric'];
        }
        if(isset($map['no_lyric'])){
            $model->noLyric = $map['no_lyric'];
        }
        return $model;
    }
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 原文歌词（带时间戳）
    /**
     * @var string
     */
    public $lyric;

    // 译文歌词
    /**
     * @var string
     */
    public $transLyric;

    // 纯文本歌词
    /**
     * @var string
     */
    public $txtLyric;

    // 是否无歌词（true=无歌词）
    /**
     * @var bool
     */
    public $noLyric;

}
