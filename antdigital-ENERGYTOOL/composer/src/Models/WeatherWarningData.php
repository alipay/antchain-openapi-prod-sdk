<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

class WeatherWarningData extends Model {
    protected $_name = [
        'district' => 'district',
        'level' => 'level',
        'severityColor' => 'severity_color',
        'type' => 'type',
        'pubTime' => 'pub_time',
        'warningStartTime' => 'warning_start_time',
        'warningEndTime' => 'warning_end_time',
        'title' => 'title',
        'content' => 'content',
    ];
    public function validate() {
        Model::validateRequired('district', $this->district, true);
        Model::validateRequired('pubTime', $this->pubTime, true);
        Model::validateRequired('title', $this->title, true);
        Model::validatePattern('pubTime', $this->pubTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('warningStartTime', $this->warningStartTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('warningEndTime', $this->warningEndTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->district) {
            $res['district'] = $this->district;
        }
        if (null !== $this->level) {
            $res['level'] = $this->level;
        }
        if (null !== $this->severityColor) {
            $res['severity_color'] = $this->severityColor;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->pubTime) {
            $res['pub_time'] = $this->pubTime;
        }
        if (null !== $this->warningStartTime) {
            $res['warning_start_time'] = $this->warningStartTime;
        }
        if (null !== $this->warningEndTime) {
            $res['warning_end_time'] = $this->warningEndTime;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return WeatherWarningData
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['district'])){
            $model->district = $map['district'];
        }
        if(isset($map['level'])){
            $model->level = $map['level'];
        }
        if(isset($map['severity_color'])){
            $model->severityColor = $map['severity_color'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['pub_time'])){
            $model->pubTime = $map['pub_time'];
        }
        if(isset($map['warning_start_time'])){
            $model->warningStartTime = $map['warning_start_time'];
        }
        if(isset($map['warning_end_time'])){
            $model->warningEndTime = $map['warning_end_time'];
        }
        if(isset($map['title'])){
            $model->title = $map['title'];
        }
        if(isset($map['content'])){
            $model->content = $map['content'];
        }
        return $model;
    }
    // 区县名
    /**
     * @example 宜兴市
     * @var string
     */
    public $district;

    // 预警级别
    /**
     * @example 2
     * @var string
     */
    public $level;

    // 预警等级
    /**
     * @example Yellow
     * @var string
     */
    public $severityColor;

    // 预警类型
    /**
     * @example other
     * @var string
     */
    public $type;

    // 发布时间
    /**
     * @example 2026-01-01T01:54:00.000+00:00
     * @var string
     */
    public $pubTime;

    // 预警开始时间
    /**
     * @example 2026-01-01T01:54:00.000+00:00
     * @var string
     */
    public $warningStartTime;

    // 预警结束时间
    /**
     * @example 2026-01-01T01:54:00.000+00:00
     * @var string
     */
    public $warningEndTime;

    // 标题
    /**
     * @example 如东县气象台发布海区大风黄色预警
     * @var string
     */
    public $title;

    // 预警内容
    /**
     * @example 受较强冷空气影响，预计1日夜里到2日白天我县海区将出现9级左右的偏北大风
     * @var string
     */
    public $content;

}
