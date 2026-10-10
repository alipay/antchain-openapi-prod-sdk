<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class AgentMusicSong extends Model {
    protected $_name = [
        'songId' => 'song_id',
        'songName' => 'song_name',
        'artistName' => 'artist_name',
        'duration' => 'duration',
        'isLiked' => 'is_liked',
        'playFlag' => 'play_flag',
        'vipPlayFlag' => 'vip_play_flag',
        'vipFlag' => 'vip_flag',
        'songFee' => 'song_fee',
        'coverImgUrl' => 'cover_img_url',
        'qualities' => 'qualities',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->songId) {
            $res['song_id'] = $this->songId;
        }
        if (null !== $this->songName) {
            $res['song_name'] = $this->songName;
        }
        if (null !== $this->artistName) {
            $res['artist_name'] = $this->artistName;
        }
        if (null !== $this->duration) {
            $res['duration'] = $this->duration;
        }
        if (null !== $this->isLiked) {
            $res['is_liked'] = $this->isLiked;
        }
        if (null !== $this->playFlag) {
            $res['play_flag'] = $this->playFlag;
        }
        if (null !== $this->vipPlayFlag) {
            $res['vip_play_flag'] = $this->vipPlayFlag;
        }
        if (null !== $this->vipFlag) {
            $res['vip_flag'] = $this->vipFlag;
        }
        if (null !== $this->songFee) {
            $res['song_fee'] = $this->songFee;
        }
        if (null !== $this->coverImgUrl) {
            $res['cover_img_url'] = $this->coverImgUrl;
        }
        if (null !== $this->qualities) {
            $res['qualities'] = $this->qualities;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AgentMusicSong
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['song_id'])){
            $model->songId = $map['song_id'];
        }
        if(isset($map['song_name'])){
            $model->songName = $map['song_name'];
        }
        if(isset($map['artist_name'])){
            $model->artistName = $map['artist_name'];
        }
        if(isset($map['duration'])){
            $model->duration = $map['duration'];
        }
        if(isset($map['is_liked'])){
            $model->isLiked = $map['is_liked'];
        }
        if(isset($map['play_flag'])){
            $model->playFlag = $map['play_flag'];
        }
        if(isset($map['vip_play_flag'])){
            $model->vipPlayFlag = $map['vip_play_flag'];
        }
        if(isset($map['vip_flag'])){
            $model->vipFlag = $map['vip_flag'];
        }
        if(isset($map['song_fee'])){
            $model->songFee = $map['song_fee'];
        }
        if(isset($map['cover_img_url'])){
            $model->coverImgUrl = $map['cover_img_url'];
        }
        if(isset($map['qualities'])){
            if(!empty($map['qualities'])){
                $model->qualities = $map['qualities'];
            }
        }
        return $model;
    }
    // 歌曲 ID
    /**
     * @example id123456
     * @var string
     */
    public $songId;

    // 歌名
    /**
     * @example 三只松鼠
     * @var string
     */
    public $songName;

    // 歌手（多歌手用 / 分隔）
    /**
     * @example 林君杰/周伦
     * @var string
     */
    public $artistName;

    // 时长(ms)
    /**
     * @example 208888
     * @var int
     */
    public $duration;

    // 是否已添加红心
    /**
     * @example true
     * @var bool
     */
    public $isLiked;

    // 播放标记，取值范围：0=可播放 / 1=不可播放
    /**
     * @example 0
     * @var int
     */
    public $playFlag;

    // VIP 播放标记，取值范围：0=免费（非 VIP 限制） / 1=VIP 专享
    /**
     * @example 0
     * @var int
     */
    public $vipPlayFlag;

    // VIP 标记（0=否，1=是）
    /**
     * @example 0
     * @var int
     */
    public $vipFlag;

    // 收费类型，取值范围：0=免费 / 1=VIP / 4=付费专辑 / 8=低质量免费
    /**
     * @example 0
     * @var int
     */
    public $songFee;

    // 封面 URL
    /**
     * @example http://p2.music.126.net/t8H-_P4uF567.jpg
     * @var string
     */
    public $coverImgUrl;

    // 可用音质 code 列表，取值范围：vividMusic=Audio Vivid / dolbyMusic=杜比 / skMusic=沉浸环绕声 / jyMasterMusic=超清母带 / jyEffectMusic=高清臻音 / hrMusic=Hi-Res / sqMusic=无损 / hmusic=极高 / mmusic=较高 / lmusic=标准
    /**
     * @example ["dolbyMusic","hrMusic"]
     * @var string[]
     */
    public $qualities;

}
